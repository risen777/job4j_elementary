package ru.job4j.condition;

/**
 * Created by Sergey
 */
public class DummyBot {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String result = answer("Пока.");
        System.out.println(result);
    }

    /**
     * @param question
     * @return
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            rsl = "До скорой встречи.";
        } else {
            return rsl;
        }
        return rsl;
    }

}
