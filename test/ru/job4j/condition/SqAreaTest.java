package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class SqAreaTest {

    @Test
    public void square() {
        double delta = 0.01;
        int p = 6;
        int k = 2;
        double expected = 2.0;

        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, delta);

    }
}