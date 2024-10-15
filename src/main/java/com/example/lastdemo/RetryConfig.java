/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.util.concurrent.TimeUnit;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.retry.RetryPolicy;
import org.springframework.retry.policy.ExceptionClassifierRetryPolicy;
import org.springframework.retry.policy.NeverRetryPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author volam.kumar
 */
@Configuration
public class RetryConfig {

    private static final int MAX_RETRY_ATTEMPTS = 2;

    private final SimpleRetryPolicy simpleRetryPolicy = new SimpleRetryPolicy(MAX_RETRY_ATTEMPTS);
    private final NeverRetryPolicy neverRetryPolicy = new NeverRetryPolicy();

    @Bean
    public PoolingHttpClientConnectionManager customizedPoolingHtppClientConnectionManager() {
        /*
        Setting the connection caching time to 5 minutes, so that the connection is in an open state for 5 mins.
        This will add some extra time as every 5 mins SSL handshake will happen. However, software is all about trade-off,
        and here we are making sure, we don't keep calling cached API DNS
         */
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(5, TimeUnit.MINUTES);
        connManager.setMaxTotal(10);    // Set maximum total connections
        connManager.setDefaultMaxPerRoute(20);     // Set maximum connections per route
        return connManager;
    }

    @Bean
    public RestTemplate restTemplate() {
        RequestConfig reqConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(10000) //in milliseconds
                .setConnectTimeout(10000)
                .setSocketTimeout(10000)
                .build();

        HttpClientBuilder clientBuilder = HttpClientBuilder.create()
                .setConnectionManager(customizedPoolingHtppClientConnectionManager())
                .setConnectionManagerShared(true) //this is important to set as true in case of more than one downstream APIs as we want to set a common HTTP connection pool
                .setDefaultRequestConfig(reqConfig);

        HttpComponentsClientHttpRequestFactory reqFactor = new HttpComponentsClientHttpRequestFactory();
        reqFactor.setHttpClient(clientBuilder.build());

        return new RestTemplate(reqFactor);
    }

    @Bean
    public RetryTemplate retryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();

        ExceptionClassifierRetryPolicy policy = new ExceptionClassifierRetryPolicy();
        policy.setExceptionClassifier(configureStatusCodeBasedRetryPolicy());
        retryTemplate.setRetryPolicy(policy);
        return retryTemplate;
    }

    private Classifier<Throwable, RetryPolicy> configureStatusCodeBasedRetryPolicy() {
        return throwable -> {
            if (throwable instanceof HttpStatusCodeException) {
                HttpStatusCodeException exception = (HttpStatusCodeException) throwable;
                return getRetryPolicyForStatus(exception.getStatusCode());
            }
            return simpleRetryPolicy;
        };
    }

    private RetryPolicy getRetryPolicyForStatus(HttpStatus httpStatus) {
        System.out.println("in retry block");
        switch (httpStatus) {
            case BAD_GATEWAY:
            case SERVICE_UNAVAILABLE:
            case INTERNAL_SERVER_ERROR:
            case GATEWAY_TIMEOUT:
                return simpleRetryPolicy;
            default:
                return neverRetryPolicy;
        }
    }

}
