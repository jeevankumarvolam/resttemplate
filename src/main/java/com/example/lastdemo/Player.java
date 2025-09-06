package com.example.lastdemo;

import com.google.gson.annotations.Expose;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Scope("request")

@Component
public class Player {
private int count=0;
    private final Lock lock = new ReentrantLock(); // Create a lock instance

    public void increment() throws InterruptedException {
       // lock.lock();
        lock.newCondition();
        lock.tryLock(3, TimeUnit.MICROSECONDS);
        // Explicitly acquire the lock
        try {
            count++;
        } finally {
            lock.unlock(); // Always release the lock in a 'finally' block
        }
    }

    public int getCount() {
        return count;
    }

    @Expose
    int score = 10;

    String name = "jeevan";

    @Override
    public String toString() {
        return "Player{" + "score=" + score + ", name=" + name + ", state=" + state + ", student=" + student + '}';
    }

    private String state;

    @Expose
    Student student = new Student();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Player() {

    }

    public String getName() {
        return this.name;

    }

    public int getScore() {
        return this.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(int score) {
        this.score = score;
    }
}
