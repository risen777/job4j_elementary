package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class StringEq {
    public static boolean check(String login) {
        String root = "root";
        boolean access = root == login;
        return access;
    }

    public static void main(String[] args) {
        String your = "root";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
        your = "cracker";
        userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);

    }
}


