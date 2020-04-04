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

        double in = 177;
        double expectedMan = 88.55;
        double expectedWoman = 77.05;
        double out = manWeight(in);
        boolean passed = expectedMan == out;
        System.out.println("177 - perfect weight for man are 88.55 " + passed);
        out = womanWeight(in);
        passed = expectedWoman == out;
        System.out.println("177 - perfect weight for woman are 77.05 " + passed);

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
