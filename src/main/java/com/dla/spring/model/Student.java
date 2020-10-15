package com.dla.spring.model;



public class Student {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    private String exp;
    
    public Student(String name, String exp)
    {
        this.name = name;
        this.exp = exp;
    }

}