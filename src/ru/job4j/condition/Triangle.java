package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Triangle {


    /**
     * @param ab
     * @param ac
     * @param bc
     * @return
     */
    public static boolean exist(double ab, double ac, double bc) {

        boolean result = (ab + ac > bc && (ac + bc > ab && (ab + bc > ac)));

        return result;
    }


}
