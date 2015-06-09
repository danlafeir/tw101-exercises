package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length*width;
    }
}
