package ru.job4j.conveter;

import org.junit.Test;
import org.junit.Assert;


/**
 * Created by Sergey
 */
public class ConveterTest {



    @Test
    public void whenConvert180RblThen2Euro57Cent() {
        double in = 180;
        double expected = 2.57;

        double out = Conveter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenConvert0RblThen0Euro() {
        double in = 0;
        double expected = 0;

        double out = Conveter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double in = 180;
        double expected = 3.0;

        double out = Conveter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}