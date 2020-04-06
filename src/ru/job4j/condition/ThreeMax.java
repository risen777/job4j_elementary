package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else if (second > first && second > third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        } else if (first == second && second > third) {
            result = first;
        } else if (first == third && third > second) {
            result = third;
        } else {
            result = first;
        }

        return result;
    }

}
