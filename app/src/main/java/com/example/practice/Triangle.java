package com.example.practice;

public class Triangle extends Shape {
    protected double side1,side2,side3;
    @Override
    public double area() {
        double s= (side1+side2+side3)/2;
        double a = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return a;
    }

    @Override
    public double perimeter() {
        return (side1+side2+side3);
    }

    public void setTriangle(double s1, double s2, double s3){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
    }
    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

}