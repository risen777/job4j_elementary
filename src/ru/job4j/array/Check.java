package ru.job4j.array;

/**
 * Created by Sergey
 */
public class Check {

    /**
     * @param data
     * @return
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {

                result = false;
                break;
            }
        }
        return result;
    }

}

