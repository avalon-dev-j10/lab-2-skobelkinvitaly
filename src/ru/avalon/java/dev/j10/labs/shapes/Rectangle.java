package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы прямые (равны 90
 * градусам).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape {

    private int rotation;
    private float area;
    private float perimetr;
    private float x;
    private float y;
    private float length;

    public float getArea() {
        return area;
    }

    public int getRotation() {
        return rotation;
    }

    public float getPerimetr() {
        return perimetr;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getLength() {
        return length;
    }

}
