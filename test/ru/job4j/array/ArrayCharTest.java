package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixThenFalseSecond() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', '1'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
    @Test
    public void whenStartWithPrefixThenTrueSecond() {
        char[] word = {'H', 'e', 'l', 'l', '9'};
        char[] pref = {'H', 'e', 'l', 'l', '9'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }
    @Test
    public void whenStartWithPrefix1ThenFalse() {
        char[] word = {'1'};
        char[] pref = {'0'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}