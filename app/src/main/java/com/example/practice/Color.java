package com.example.practice;

public abstract class Color {
    protected String name;
    abstract public String showcolor();

    public void setColor(String n){
        this.name= n;
    }
}
