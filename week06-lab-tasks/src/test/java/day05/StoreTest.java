package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store  store;
    Store store2 = new Store();

    @BeforeEach
    void setUp() {
        store = new Store();
        store.addProduct(new Product("Ice cream", Type.FROZEN,5));
        store.addProduct(new Product("Milk", Type.DIARY,0.7));
        store.addProduct(new Product("Butter", Type.DIARY,0.7));
    }

    @Test
    void addProduct() {
        assertEquals(3, store.products.size());
    }

    @Test
    void numberOfProductsByType() {
        assertEquals(2, store.numberOfProductsByType().size());
        assertEquals(Type.FROZEN, store.numberOfProductsByType().get(0).getType());
        assertEquals(1, store.numberOfProductsByType().get(0).getCount());
    }

    @Test
    void numberOfProducts() {
        assertEquals(2, store.numberOfProductsByType().get(1).getCount());
    }

    @Test
    void emptyStore() {
        assertEquals(0, store2.numberOfProductsByType().size());
    }
}