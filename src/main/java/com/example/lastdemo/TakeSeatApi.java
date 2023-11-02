/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.util.concurrent.Callable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author volam.kumar
 */
@Component
@Scope("prototype")

public class TakeSeatApi implements Callable<Boolean>{
    boolean loop;

    @Override
    public Boolean call() throws Exception {
         loop=true;
        while(loop){
        
        System.out.println("in loop");
        }
        
        return loop;
        
        
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
    
}
