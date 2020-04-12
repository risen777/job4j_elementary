package ru.job4j.array;

/**
 * Created by Sergey
 */
public class ArrayChar {


    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int j = 0;

        while (j <= pref.length - 1) {
            for (int i = 0; i < pref.length - 1; i++) {

                String first = String.valueOf(word[j]);
                String second = String.valueOf(pref[j]);

                if (!first.startsWith(second, i)) {

                    result = false;

                }

            }

            j++;
        }

        return result;
    }
}

