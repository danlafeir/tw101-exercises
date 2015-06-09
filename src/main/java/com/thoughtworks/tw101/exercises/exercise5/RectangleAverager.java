package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;
        int sumOfAllTheAreas = 0;
        for(Rectangle rectangle : rectangles){
            sumOfAllTheAreas += rectangle.getArea();
        }
        return sumOfAllTheAreas/rectangles.length;
    }
}
