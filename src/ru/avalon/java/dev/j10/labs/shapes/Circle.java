package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из всех точек на
 * плоскости, равноудалённых от заданной точки.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle {

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
