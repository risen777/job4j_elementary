package ru.job4j.array;

/**
 * Created by Sergey
 */
public class MinDiapason {


    /**
     * @param array
     * @param start
     * @param finish
     * @return
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {

            if (array[i] < min) {
                min = array[i];
            }


        }
        return min;
    }

}
