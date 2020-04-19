package ru.job4j.array;

/**
 * Created by Sergey
 */
public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.
                //  boolean check = true;
                while (point < array.length - 1) {
                    point++;
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        break;


                    }

                }


            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }


}
