/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author volam.kumar
 */
public class Custom implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes fa) {
        try {
            //        NotRequiredForClient notRequiredForClient=getClass()
            
            if(fa.getDeclaredClass().getField(fa.getName()).isAnnotationPresent(NotRequiredForClient.class)){
               
                System.out.println(fa.getName());
                
                return true;
            }       } catch (NoSuchFieldException ex) {
            Logger.getLogger(Custom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Custom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("in skip field");
return false;

    }

    @Override
    public boolean shouldSkipClass(Class<?> type) {
        try {
            if(type.getField(type.getName()).isAnnotationPresent(NotRequiredForClient.class)){
                
                                System.out.println(type.getName());

                return true;
            }       } catch (NoSuchFieldException ex) {
            Logger.getLogger(Custom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Custom.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println("in skip class");
        return false;

    }

   }
