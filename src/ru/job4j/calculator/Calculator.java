package ru.job4j.calculator;

/**
 * Created by Sergey
 */
public class Calculator {


    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int result = one + two;
        System.out.println("result= " + result);
        one = 10;
        two = 11;
        result = one + two;
        System.out.println("result= " + result);


        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println("sixDivTwo= " + sixDivTwo);
        System.out.println("fiveMinusTwo= " + fiveMinusTwo);
        System.out.println("fourTimeTwo= " + fourTimeTwo);

        int age = 18;
        age = age + 10;
        System.out.println("age= " + age);


        int size = 10;
        size = 100;
        size = size - five;
        System.out.println("size= " + size);
    }

}
