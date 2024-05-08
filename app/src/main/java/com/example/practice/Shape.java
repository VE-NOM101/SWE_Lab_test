package com.example.practice;

public abstract class Shape {
    protected String name;
    abstract public double area();
    abstract public double perimeter();
    public void setShape(String name){
        this.name=name;
    }
    public String getShape(){
        return this.name;
    }
}

