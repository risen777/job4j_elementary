package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class PointTest {

    @Test
    public void distance() {
        double x1 = 5;
        double x2 = 2;
        double y1 = 1;
        double y2 = 2;
        double expected = 4.0;
        double out = Point.distance(x1, x2, y1, y2);
        assertEquals(expected, out, 0.01);
    }
}