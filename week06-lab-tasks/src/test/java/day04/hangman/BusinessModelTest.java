package day04.hangman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessModelTest {

    @Test
    void takeGuess() {
        BusinessModel businessModel = new BusinessModel("alma",10);
        assertTrue(businessModel.takeGuess("a"));
        assertFalse(businessModel.takeGuess("b"));
    }

    @Test
    void getWordFound() {
        BusinessModel businessModel = new BusinessModel("alma",10);
        businessModel.takeGuess("a");
        assertEquals("a__a", businessModel.getWordFound());
    }

    @Test
    void getChances() {
        BusinessModel businessModel = new BusinessModel("alma",2);
        assertEquals(2, businessModel.getChances());

        businessModel.takeGuess("a");
        assertEquals(2, businessModel.getChances());

        businessModel.takeGuess("b");
        assertEquals(1, businessModel.getChances());
    }

    @Test
    void won() {
        BusinessModel businessModel = new BusinessModel("aaaa",10);
        businessModel.takeGuess("a");
        assertTrue(businessModel.won());

        businessModel = new BusinessModel("aaaa",10);
        businessModel.takeGuess("b");
        assertFalse(businessModel.won());
    }

    @Test
    void hasMoreChance() {
        BusinessModel businessModel = new BusinessModel("alma",1);
        businessModel.takeGuess("a");
        assertTrue(businessModel.hasMoreChance());

        businessModel.takeGuess("b");
        assertFalse(businessModel.hasMoreChance());
    }
}