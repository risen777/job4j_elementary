package ru.job4j.array;

/**
 * Created by Sergey
 */
public class AlgoArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4, 7, 100, 0, -1};
        boolean isSoreted = false;
        while (!isSoreted) {
            isSoreted = true;
            for (int index = 1; index <= array.length - 1; index++) {
                int temp = array[index];
                if (array[index] < array[index - 1]) {

                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                    isSoreted = false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
