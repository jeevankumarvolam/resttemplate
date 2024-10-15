/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author volam.kumar
 */
@Component
@Aspect
public class SpringAOP {

//    @After
//    public void afterAdvice(JoinPoint jointPoint){}
    @Before("execution(public String com.example.lastdemo.Controller.handleAspect())")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("before advice method");

    }
//    @AfterReturning
//    public void afterReturn(JoinPoint joinPoint){}
////    @Around
////    public void aroundAdvice(JoinPoint joinPoint){}
//    @AfterThrowing
//    public void afterThrowing(JoinPoint joinPoint){}

}
