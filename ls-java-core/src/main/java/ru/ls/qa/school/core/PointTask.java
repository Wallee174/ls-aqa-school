package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point x = new Point(3, 8);
        Point y = new Point(5, 9);

        double distance = x.distance(y);

        System.out.println("Расстояние между точками равно: " + distance);
    }
}
