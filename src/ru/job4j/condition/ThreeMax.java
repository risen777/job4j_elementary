package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class ThreeMax {

    /**
     * @param first
     * @param second
     * @param third
     * @return
     */
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        }
        return result;
    }

}
