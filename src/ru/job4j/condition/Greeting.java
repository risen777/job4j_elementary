package ru.job4j.condition;


/**
 * Created by Sergey
 */
public class Greeting {
    /**
     * @param args
     */
    public static void main(String[] args) {


        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie";
        System.out.println(idea);
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        int year = calendar.get(java.util.Calendar.YEAR);
        System.out.println(year);

    }
}
