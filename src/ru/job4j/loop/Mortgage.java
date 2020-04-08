package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class Mortgage {


    public int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount > 0) {
            amount = ((amount + (amount * percent / 100)) - salary);
            year++;
        }

        return year;
    }


}
