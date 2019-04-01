package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static float getMaxAreaFigure(float[] mas) {
        float max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            float radius = (float) Math.random() * 10;
            float x = (float) Math.random() * 10;
            float y = (float) Math.random() * 10;
            circles[i] = new Circle(radius, x, y);
            circles[i].getArea();
            circles[i].getLength();
            circles[i].getX();
            circles[i].getY();
        }

        Rectangle[] rectangles = new Rectangle[3];
        for (int i = 0; i < rectangles.length; i++) {
            float height = ((float) Math.random()) * 10;
            float width = ((float) Math.random()) * 10;
            float x = ((float) Math.random()) * 10;
            float y = ((float) Math.random()) * 10;
            float angle = ((float) Math.random()) * 360;
            rectangles[i] = new Rectangle(width, height, x, y, angle);
            rectangles[i].getArea();
            rectangles[i].getPerimetr();
            rectangles[i].getRotation();
            rectangles[i].getX();
            rectangles[i].getY();
        }

        Triangle[] triangles = new Triangle[1];
        for (int i = 0; i < triangles.length; i++) {
            float side1 = (float) Math.random() * 10;
            float side2 = (float) Math.random() * 10;
            float side3 = (float) Math.random() * 10;
            float angle = (float) (Math.random() * 360);
            float x = ((float) Math.random()) * 10;
            float y = ((float) Math.random()) * 10;
            triangles[i] = new Triangle(side1, side2, side3, angle, x, y);
            triangles[i].getArea();
            triangles[i].getPerimetr();
            triangles[i].getRotation();
            triangles[i].getX();
            triangles[i].getY();
            triangles[i].getSide1();
            triangles[i].getSide2();
            triangles[i].getSide3();
        }

    }

}
