package day03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FiveRandomNumberTest {

    @Test
    void generateFiveRandomNumberArray() {
        FiveRandomNumber frn = new FiveRandomNumber();
        assertFalse(findEven(frn.generateFiveRandomNumberArray()));
        assertFalse(findZero(frn.generateFiveRandomNumberArray()));
    }

    private boolean findEven(int[] numbers) {
        boolean result = false;
        for (int i: numbers) {
            if (i % 2 == 0)
            {
                result = true;
            }
        }
        return result;
    }

    private boolean findZero(int[] numbers) {
        boolean result = false;
        for (int i: numbers) {
            if (i == 0)
            {
                result = true;
            }
        }
        return result;
    }
}