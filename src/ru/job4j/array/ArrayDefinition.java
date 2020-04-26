package ru.job4j.array;

/**
 * Created by Sergey
 */
public class ArrayDefinition {


    /**
     * @param args
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Иванов1";
        names[1] = "Иванов2";
        names[2] = "Иванов3";
        names[3] = "Иванов4";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}