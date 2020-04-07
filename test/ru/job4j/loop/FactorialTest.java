package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class FactorialTest {

    @Test
    public void calcWhenN5() {

        int expected = 120;
        int out = Factorial.calc(5);
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void calcWhenN0() {

        int expected = 1;
        int out = Factorial.calc(0);
        Assert.assertThat(out, is(expected));
    }
    @Test
    public void calcWhenN1() {

        int expected = 1;
        int out = Factorial.calc(1);
        Assert.assertThat(out, is(expected));
    }
}