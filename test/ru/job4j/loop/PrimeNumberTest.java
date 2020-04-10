package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(2));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(4));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(0));
    }

}