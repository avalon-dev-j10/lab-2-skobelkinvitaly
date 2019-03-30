package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая фигура,
 * образованная тремя отрезками, которые соединяют три точки, не лежащие на
 * одной прямой. Указанные три точки называются вершинами треугольника, а
 * отрезки — сторонами треугольника. Часть плоскости, ограниченная сторонами,
 * называется внутренностью треугольника: нередко треугольник рассматривается
 * вместе со своей внутренностью (например, для определения понятия площади).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape {

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
