package ru.job4j.array;

/**
 * Created by Sergey
 */
public class EndsWith {

    /**
     * @param word
     * @param post
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[word.length - post.length + i]) {
                result = false;
                break;
            }


        }
        return result;
    }


}
