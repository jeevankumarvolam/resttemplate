/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author volam.kumar
 */
public class virtualthreads {
    
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        
        System.out.println("Java version: " + version);
     int virtualThreads = 10000;
Executor executor=Executors.newFixedThreadPool(10000,Thread.ofVirtual().factory());
//Executor executor=Executors.newFixedThreadPool(10000);

// One million virtual threads!
     //ExecutorService executor = Executors.newThreadPerTaskExecutor(Thread.ofVirtual().factory());

      
            for (int i = 0; i < virtualThreads; i++) {
                executor.execute(() -> {
                    try {
                        System.out.println("name "+Thread.currentThread());

                        Thread.sleep(10); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        

        System.out.println("Created " + virtualThreads + " virtual threads!");
        
   }
    }
    

