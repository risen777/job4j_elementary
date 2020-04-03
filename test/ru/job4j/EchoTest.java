package ru.job4j;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Sergey
 */
public class EchoTest {

    @Test
    public void whenActionThenResult(){
        int expected=1;
        int result=1;
assertThat(result,is(expected));

    }

}
