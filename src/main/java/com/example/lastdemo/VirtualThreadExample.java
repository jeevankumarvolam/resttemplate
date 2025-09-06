package com.example.lastdemo;

import java.util.Comparator;
import java.util.HashMap;

public class VirtualThreadExample {
    public static void main(String[] args) {
//        Runnable task = () -> {
//            System.out.println("Hello from virtual thread: " + Thread.currentThread());
//        };
//
//        Thread virtualThread = Thread.ofVirtual().start(task);
//
//        System.out.println("Hello from main thread: " + Thread.currentThread());


        Student student1=new Student();//123
        Student student2=new Student();//145
        System.out.println(student1==student2);
        student2.setName("manasa");

        System.out.println(student2.equals(student1));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        HashMap<Student,String> hashmap=new HashMap<>();

//        Comparator<Student> studentComparator=Comparator.comparing(st).reversed();

        hashmap.put(student1,"33");
        hashmap.put(student2,"35");
   hashmap.entrySet().stream().forEach(s->{
       System.out.println("key"+s.getKey()+" value"+s.getValue());
   });
       for(int i=0;i<10;i++){
        System.out.println(hashmap.get(student1));}


    }
}
