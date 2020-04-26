package ru.job4j.array;

/**
 * Created by Sergey
 */
public class SortSelected {


    /**
     * @param data
     * @return
     */
    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            data[index] = data[i];
            data[i] = min;


        }
        return data;
    }
}
