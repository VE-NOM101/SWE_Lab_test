package com.example.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest2 {

    @Test
    public void squareTest(){
        Square square_obj = new Square();
        square_obj.setSquare(10);

        assertEquals(100,square_obj.area(),0);
    }

}