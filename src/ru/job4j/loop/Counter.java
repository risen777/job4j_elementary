package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class Counter {
    /**
     * @param start
     * @param finish
     * @return
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }


    /**
     * @param start
     * @param finish
     * @return
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
