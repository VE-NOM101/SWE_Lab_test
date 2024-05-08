package com.example.practice;

public class Square extends Shape {
    protected double side_length;
    @Override
    public double area() {
        return side_length*side_length;
    }

    @Override
    public double perimeter() {
        return 4*side_length;
    }

    public void setSquare(double length){
        this.side_length=length;
    }
    public double getSquare(){
        return this.side_length;
    }
}
