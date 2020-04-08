package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class CheckPrimeNumber {

    public static boolean check(int number) {
        int i = 2;
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        while (i <= number - 1) {
            if (number % i == 0) {
                prime = false;
            }
            i++;
        }


        return prime;
    }
}
