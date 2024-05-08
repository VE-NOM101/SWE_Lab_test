package com.example.practice;

public class Circle extends Shape {

    protected double radius;
    @Override
    public double area(){
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return (double) 2*3.14*radius;
    }

    public void setRadius(double r){
        this.radius=r;
    }
    public double getRadius(){
        return this.radius;
    }
}
