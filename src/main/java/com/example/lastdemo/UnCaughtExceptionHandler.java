/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import org.springframework.stereotype.Component;

/**
 *
 * @author volam.kumar
 */
@Component
public class UnCaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(System.currentTimeMillis());
        System.out.println("the method name: " + e.getStackTrace()[0].getMethodName());
        System.out.println("the exception is: " + e);

    }

}
