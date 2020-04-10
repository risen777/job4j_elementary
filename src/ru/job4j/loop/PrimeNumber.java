package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class PrimeNumber {


    public int calc(int finish) {
        int count = 0;
        boolean check = true;
        for (int number = 2; number < finish; number++) {
            boolean rsl = CheckPrimeNumber.check(number);
            if (check == rsl) {
                count++;
            }
        }
        return count;
    }

}
