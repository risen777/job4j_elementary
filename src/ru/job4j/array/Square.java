package ru.job4j.array;

/**
 * Created by Sergey
 */
public class Square {

    /**
     * @param bound
     * @return
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

}
