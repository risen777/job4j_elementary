package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Triangle {


    public static boolean exist(double ab, double ac, double bc) {

        boolean result = true ? (ab + ac > bc && (ac + bc > ab && (ab + bc > ac))) : false;

        return result;
    }


}
