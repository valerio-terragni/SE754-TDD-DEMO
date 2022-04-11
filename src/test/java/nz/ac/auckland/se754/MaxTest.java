package nz.ac.auckland.se754;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTest {

    @Test
    public void test_max_should_return_20(){
        int expected = 20;
        int actual = Max.getMax(10,20);
        assertEquals(expected, actual);
    }

}
