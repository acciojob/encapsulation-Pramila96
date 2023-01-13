package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly rw=new RWOnly();
        //rw.name="pramila";
       // System.out.println(rw.name);
        //can not access directly private data
        rw.setName("pramila");
        System.out.println(rw.getName());

    }
  
}