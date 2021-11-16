package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {

    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

    @Test
    void getBrand() {
        assertEquals("Toyota", car1.getBrand());

    }

    @Test
    void getEngineSize() {
        assertEquals(1.2, car1.getEngineSize());
    }

    @Test
    void getColor() {
        assertEquals(Color.BLACK, car1.getColor());

    }

    @Test
    void getPrice() {
        assertEquals(2_300_000,car1.getPrice());
    }

    @Test
    void decreasePrice() {
        car1.decreasePrice(10);
        assertEquals(2_070_000,car1.getPrice());
    }
}