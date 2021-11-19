package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    ProductWithPiece productWithPiece;

    @BeforeEach
    void init() {
        productWithPiece = new ProductWithPiece(Type.FROZEN);
    }

    @Test
    void getType() {
        assertEquals(Type.FROZEN, productWithPiece.getType());
    }

    @Test
    void getCount() {
        assertEquals(1, productWithPiece.getCount());
    }

    @Test
    void incrementCount() {
        productWithPiece.incrementCount();
        assertEquals(2, productWithPiece.getCount());
    }
}