package day02.cars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static day02.cars.Color.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorTest {
    @Test
    void colorEnuMTest() {
        assertEquals(Arrays.toString(new Color[]{RED, BLACK, BLUE, GREY}), Arrays.toString(Color.values()));
    }
}
