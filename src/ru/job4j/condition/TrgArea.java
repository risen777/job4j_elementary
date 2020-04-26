package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class TrgArea {
    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        rsl = Double.parseDouble(String.format("%.2f", rsl));
        System.out.println("area (2, 2, 2) = " + rsl);


        double expected = 1.73;
        double out = TrgArea.area(2, 2, 2);
        out = Double.parseDouble(String.format("%.2f", rsl));
        boolean passed = expected == out;
        System.out.println("Test result : " + passed);
    }
}
