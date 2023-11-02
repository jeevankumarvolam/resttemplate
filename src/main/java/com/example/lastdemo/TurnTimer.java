/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author volam.kumar
 */

@Component
@Scope("prototype")
public class TurnTimer  extends Thread{
    
    private int turnTime=50;
     @Override
    public void run() {
       boolean b=true;
    int i=0;
        while(b){
        
           try {
               TimeUnit.SECONDS.sleep(1L);
               System.out.println("the turn time is:"+turnTime);
           } catch (InterruptedException ex) {
               System.out.print(""+ex);
Thread.interrupted();
           }
        System.out.println(i);
        i++;
        if(i==turnTime){
        b=false;
        }
        
        
        
        }
    
    
    
    }

    public int getTurnTime() {
        return turnTime;
    }

    public void setTurnTime(int turnTime) {
        this.turnTime = turnTime;
    }
    
    
    
    
}
