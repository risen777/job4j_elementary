package ru.job4j.calculator;

/**
 * Created by Sergey
 */
public class Fit {


    public static void main(String[] args) {
        double perfectManWeight = Fit.manWeight(177);
        double perfectWomanWeight = Fit.womanWeight(177);
        System.out.println("Идеальный вес для мужчин = " + perfectManWeight);
        System.out.println("Идеальный вес для женщин = " + perfectWomanWeight);


    }


    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

}
