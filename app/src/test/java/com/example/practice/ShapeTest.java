package com.example.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

    @Test
    public void circleTest(){
        Circle circleObj = new Circle();
        circleObj.setRadius(5);

        assertEquals(78.5,circleObj.area(),0);
        assertEquals(31.400000000000002,circleObj.perimeter(),0);
    }
    @Test
    public void triangleTest(){
        Triangle triangleObj = new Triangle();
        triangleObj.setTriangle(4,4,4);

        assertEquals(7,Math.ceil(triangleObj.area()),0);
    }



}