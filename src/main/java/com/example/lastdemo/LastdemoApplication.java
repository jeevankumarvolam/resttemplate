package com.example.lastdemo;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class LastdemoApplication {

    public static void main(String[] args) throws IOException {

        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.BasicAsyncLoggerContextSelector");
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.print(name.split("@")[0]);
        SpringApplication.run(LastdemoApplication.class, args);
    }
    
   

}
