package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class SqArea {
    /**
     * @param p
     * @param k
     * @return
     */
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));

        int l = h * k;

        double rsl = l * h;


        return rsl;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result);


        double expected = 2.0;
        double out = square(6, 2);
        boolean passed = expected == out;
        System.out.println("p = 6, k = 2, square are 2.0. Test result : " + passed);
    }


}