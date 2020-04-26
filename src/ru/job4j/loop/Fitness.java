package ru.job4j.loop;

/**
 * Created by Sergey
 */
public class Fitness {

    /**
     * @param ivan
     * @param nik
     * @return
     */
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }


        return month;
    }


}
