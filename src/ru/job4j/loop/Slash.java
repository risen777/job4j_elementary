package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class Slash {
    /**
     * @param size
     */
    public static void draw(int size) {
        for (int row = 0; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                if (row == cell - 1) {
                    System.out.print("0");
                } else if (cell + row == size) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }

}
