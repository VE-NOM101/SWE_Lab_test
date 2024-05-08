package com.example.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

    @Test
    public void redTest(){
        Color red_obj = new Red();
        red_obj.setColor("red");

        assertEquals("red",red_obj.showcolor());
    }
    @Test
    public void blueTest(){
        Color blue_obj = new Blue();
        blue_obj.setColor("blue");

        assertEquals("blue",blue_obj.showcolor());
    }
    @Test
    public void greenTest(){
        Color green_obj = new Green();
        green_obj.setColor("green");

        assertEquals("green",green_obj.showcolor());
    }

}