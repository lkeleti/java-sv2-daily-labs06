package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundAmountTest {

    @Test
    void roundAmount() {
        RoundAmount ra = new RoundAmount();

        assertEquals(10,ra.roundAmount(10));
        assertEquals(10,ra.roundAmount(11));
        assertEquals(10,ra.roundAmount(12));

        assertEquals(15,ra.roundAmount(13));
        assertEquals(15,ra.roundAmount(14));
        assertEquals(15,ra.roundAmount(15));
    }
}