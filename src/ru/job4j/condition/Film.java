package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class Film {
    /**
     * @param age
     * @return
     */
    public static String permission(int age) {
        String label = age < 16 ? "Please, enjoy it." : age > 18 ? "Please, enjoy it 33." : "You can't watch it.";
        return label;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = Film.permission(17);
        System.out.println(msg);
    }

}
