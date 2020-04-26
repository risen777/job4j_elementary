package ru.job4j.array;

/**
 * Created by Sergey
 */
public class Min {

    /**
     * @param array
     * @return
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {

            if (array[index] < min) {
                min = array[index];

            }

        }
        return min;
    }

}
