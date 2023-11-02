/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author volam.kumar
 */
@Component
public class PlatformService {

    @Autowired
    PoolingHttpClientConnectionManager poolingHttpClientConnectionManager;
    @Autowired
    RetryConfig retryConfig;
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private RetryTemplate retryTemplate;
    
    public <T,V> V post(String url, T requestBody, MultiValueMap<String, String> headers, V responseBody) throws URISyntaxException {
       
        
        try{
            retryTemplate=retryConfig.retryTemplate();
        System.out.println("the request body we recieved is:"+requestBody.toString());
        
        String authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiJiczV1aHI4Mnl4bXcxcG4iLCJzY3JlZW5OYW1lIjoiZ2hvc3RyaWRlcjEiLCJtb2JpbGUiOiIrOTE5OTQ5NTk0OTQ2Iiwic3RhdHVzIjp0cnVlLCJkZXZpY2VfaWQiOiIzOWI2OTk3ODMzNTMxNzYwIiwiY2hhbm5lbCI6IkEyM0FQUyIsInBsYXllclN0YXR1cyI6Im51bGwiLCJpYXQiOjE2OTc3MDU1MDAsImV4cCI6MTY5Nzc5MTkwMH0.8CCo2wNuT8MNw9LBFqXS8sZcDLZNW_K6zfJJcs90BEg";
        String apiKey = "a23games";
        String appVersion = "1.2";
        headers.add("content-type", "application/json");
        
        headers.add("Authorization", authToken);
        
        headers.add("api_key", apiKey);
        headers.add("app_version", appVersion);
        
//        VerifyUser verifyUser = new VerifyUser();

//        class  responseType=responseBody.getClass();
        
//        verifyUser.setApp_id(126);
//        verifyUser.setGame_type("carrom");
//        verifyUser.setGame_id("hajiwe23");
//        verifyUser.setUser_id("dhakdhakadnk");
            ResponseEntity<? extends Object> responseEntity;
        RequestEntity requestEntity = new RequestEntity(requestBody, headers, HttpMethod.POST, new URI(url));
        retryTemplate.execute(context
                -> {System.out .println(restTemplate.exchange(requestEntity,responseBody.getClass()).getBody().toString());
        return null;
        });



        System.out.println("Available: "+poolingHttpClientConnectionManager.getTotalStats().getAvailable()+"Leased: "+poolingHttpClientConnectionManager.getTotalStats().getLeased());

        }
    catch(Exception ex){
    
    System.out.println("Exception while posting to verify user"+ex);


    }
return null;
    }
    
}
