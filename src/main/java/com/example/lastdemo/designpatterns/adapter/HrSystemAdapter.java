package com.example.lastdemo.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class HrSystemAdapter {

    private NewHrSystem newHrSystem;

    public List<Employee> getListOfEmployees(){

        //here we convert the new hr system employees to array list which is expected
        return new ArrayList<>();
    }

}
