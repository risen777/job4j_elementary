package ru.job4j.array;

/**
 * Created by Sergey
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
            return rst;
        }
    }

