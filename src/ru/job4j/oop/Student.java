package ru.job4j.oop;

/**
 * Класс - Студент
 *
 * @author shumov
 */
public class Student {

    public void music() {

        System.out.println("Tra tra tra");
    }

    public void song() {

        System.out.println("I believe I can fly");
    }

    /**
     * Собираем объект Студент
     * @param args
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();

        petya.music();
        petya.music();
        petya.music();


    }

}
