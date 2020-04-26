package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Liken {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}
