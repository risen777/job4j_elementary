package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Max {


    public static int max(int left, int right) {

        int result = left > right ? left : right;
        return result;
    }

}
