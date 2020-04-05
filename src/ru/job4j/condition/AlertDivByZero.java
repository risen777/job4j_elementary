package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class AlertDivByZero {

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(-1);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is positive number");
        }

    }

}
