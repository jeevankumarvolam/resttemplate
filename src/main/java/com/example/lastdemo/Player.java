package com.example.lastdemo;

import com.google.gson.annotations.Expose;

public class Player {
@Expose
    int score=10;
    
    String name="jeevan";
    
    private String state;
    
    
    @Expose
    Student student=new Student();

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
    
    



    public Player(){
    
    }



    public String getName(){
         return this.name;

    }

    public int getScore() {
        return this.score;
    }


public  void setName(String name){
        this.name=name;
}

    public void setScore(int score) {
        this.score = score;
    }

    public Player(int score) {
        this.score = score;
    }
}
