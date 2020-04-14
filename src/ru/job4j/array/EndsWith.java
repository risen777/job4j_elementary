package ru.job4j.array;

/**
 * Created by Sergey
 */
public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            System.out.println(word[word.length - post.length + i]);
            if (post[i] != word[word.length - post.length + i]) {
                result = false;
                break;
            }


        }
        return result;
    }


}
