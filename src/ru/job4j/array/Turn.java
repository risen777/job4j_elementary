package ru.job4j.array;

/**
 * Created by Sergey
 */
public class Turn {

    /**
     * @param array
     * @return
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

}
