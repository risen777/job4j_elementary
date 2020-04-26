package ru.job4j.array;

/**
 * Created by Sergey
 */
public class ArrayLoop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
            System.out.println(numbers[i]);

        }


    }


}
