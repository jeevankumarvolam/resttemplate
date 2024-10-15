/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lastdemo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;

/**
 *
 * @author volam.kumar
 */
@JsonInclude(Include.NON_EMPTY)
public class Student {

//  int marks;
    @Expose
    String name = "jeevan studentt";
    String section = "A";

//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}
