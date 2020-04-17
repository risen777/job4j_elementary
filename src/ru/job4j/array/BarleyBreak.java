package ru.job4j.array;

/**
 * Created by Sergey
 */
public class BarleyBreak {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k++;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

