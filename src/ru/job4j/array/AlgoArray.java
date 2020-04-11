package ru.job4j.array;

/**
 * Created by Sergey
 */
public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4, 7, 100, 0, -1};
//            int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
//            array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
//            array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.
        boolean isSoreted = false;
        while (!isSoreted) {
            isSoreted = true;

            for (int index = 1; index <= array.length - 1; index++) {
                int temp = array[index];
                if (array[index] < array[index - 1]) {

                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                    isSoreted = false;
                }


                //   System.out.println(array[index]);
            }


        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
