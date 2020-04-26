package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Max {


    /**
     * @param left
     * @param right
     * @return
     */
    public static int max(int left, int right) {

        int result = left > right ? left : right;
        return result;
    }

}
