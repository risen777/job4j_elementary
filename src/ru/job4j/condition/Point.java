package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double firstMinus = x2 - x1;
        double seconMinus = y2 - y1;
        double firstPow = Math.pow(firstMinus, 2);
        double secondPow = Math.pow(seconMinus, 2);
        double firstPlusSecond = firstPow + secondPow;
        double rsl = Math.sqrt(firstPlusSecond);
        return rsl;


    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0)= " + result);

        double expected1 = 2.0;
        double out = Point.distance(0, 0, 2, 0);
        boolean passed = expected1 == out;
        System.out.println("result (0, 0) to (2, 0) are 2.0 : " + passed);
    }
}
