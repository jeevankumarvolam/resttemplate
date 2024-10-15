/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.util.Arrays;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author volam.kumar
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void handleAllExceptions(Exception ex) {
        System.out.println("in global exception handler");
        System.out.println("the method name is: " + ex.getStackTrace()[0].getMethodName());
        System.out.println("the exception is: " + ex);
        System.out.println("the stack trace is: " + Arrays.toString(ex.getStackTrace()));
    }

}
