package ru.job4j.array;

/**
 * Created by Sergey
 */
public class FindLoop {
    /**
     * @param data
     * @param el
     * @return
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }


    /**
     * @param data
     * @param el
     * @param start
     * @param finish
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }

        return rst;
    }


}

