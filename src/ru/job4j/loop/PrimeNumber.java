package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class PrimeNumber {


    /**
     * @param finish
     * @return
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number < finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

}
