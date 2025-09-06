package com.example.lastdemo;

import java.lang.Thread;

public class NewPlatformThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello from the new platform thread: " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Hello from the main thread: " + Thread.currentThread().getName());
    }
}