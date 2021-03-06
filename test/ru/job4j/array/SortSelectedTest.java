package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }



    @Test
    public void whenSortNext() {
        int[] input = new int[] {1, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 4, 5};
        assertThat(result, is(expect));
    }


    @Test
    public void whenSortSecond() {
        int[] input = new int[] {1, 4, 1, 2, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 4};
        assertThat(result, is(expect));
    }
}