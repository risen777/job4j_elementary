package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class StringEq {
    /**
     * @param login
     * @return
     */
    public static boolean check(String login) {
        String root = "root";
        boolean access = root.equals(login);
        return access;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String your = "root";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
        your = "cracker";
        userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);

    }
}


