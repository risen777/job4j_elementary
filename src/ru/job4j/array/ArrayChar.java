package ru.job4j.array;

/**
 * Created by Sergey
 */
public class ArrayChar {


    /**
     * @param word
     * @param pref
     * @return
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }

        }
        return result;
    }
}

