package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class StringEqTest {

    @Test
    public void check() {
        String in = "root";
        boolean expected = true;

        boolean out = StringEq.check(in);
        assertEquals(expected, out);

    }
}