package ru.job4j.conveter;

/**
 * Класс - конвектор рубль-доллар/рубль-евро
 *
 * @author shumov
 */
public class Conveter {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double dollar = Conveter.rubleToDollar(140);
        double euro = Conveter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro. " + dollar + " dollar. ");

        double in = 140;
        double expected = 2;
        double out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        out = rubleToDollar(in);
        expected = 2.33;
        passed = expected == out;
        System.out.println("140 rubles are 2.33 dollar. Test result : " + passed);
    }


    /**
     * @param value
     * @return rsl
     * @author shumov
     */
    public static double rubleToEuro(double value) {

        double rsl = value / 70;
        rsl = Math.round(rsl * 100);
        return rsl / 100;

    }

    /**
     * @param value
     * @return rsl
     * @author shumov
     */
    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        rsl = Math.round(rsl * 100);
        return rsl / 100;

    }

}
