package com.example.security_demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    void m1()
    {
    List<String> list=new ArrayList<>();
    list.add("java");
    list.add("Swift");
    list.add("python");
    list.add("java");

    //we can put logic in filter method
   /* list.stream().filter(var->var.equals("java")).forEach(var-> System.out.println(var));*/
        list.stream().filter(var->var.equals("java")).forEach(var-> System.out.println(var));

    }

    public static void main(String[] args) {

        Demo d1=new Demo();
        d1.m1();
    }


}
