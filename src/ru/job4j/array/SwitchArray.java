package ru.job4j.array;

/**
 * Created by Sergey
 */
public class SwitchArray {


    /**
     * @param array
     * @param source
     * @param dest
     * @return
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;


        return array;
    }

    /**
     * @param array
     * @return
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }





}
