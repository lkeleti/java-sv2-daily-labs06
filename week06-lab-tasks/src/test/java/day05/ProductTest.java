package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    @BeforeEach
    void setUp() {
        product = new Product("Csirkemell",Type.MEAT,5);
    }

    @Test
    void getName() {
        assertEquals("Csirkemell", product.getName());
    }

    @Test
    void getType() {
        assertEquals(Type.MEAT, product.getType());
    }

    @Test
    void getPrice() {
        assertEquals(5, product.getPrice());
    }
}