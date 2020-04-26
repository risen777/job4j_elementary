package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class Factorial {
    /**
     * @param n
     * @return
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}