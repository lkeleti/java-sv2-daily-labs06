package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopClassTest {

    CarShop carShop;

    @BeforeEach
    void setUp() {
        carShop = new CarShop("Best Car", 10_000_000);

        carShop.addCar(new Car("Suzuki", 1.4, Color.RED, 1_500_000));
        carShop.addCar( new Car("Toyota", 1.4, Color.GREY, 2_700_000));
        carShop.addCar( new Car("Mercedes", 2.8, Color.RED, 11_000_000));
        carShop.addCar( new Car("Toyota", 1.6, Color.GREY, 3_000_000));
    }

    @Test
    void getName() {
        assertEquals("Best Car", carShop.getName());
    }

    @Test
    void getMaxLimit() {
        assertEquals(10_000_000, carShop.getMaxLimit());
    }

    @Test
    void getCarsForSell() {
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void addCar() {
        assertTrue(carShop.addCar( new Car("Mazda", 1.2, Color.GREY, 3_000_000)));
        assertEquals(4, carShop.getCarsForSell().size());
    }

    @Test
    void sumCarPrice() {
        assertEquals(7_200_000, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThan() {
        assertEquals(1, carShop.numberOfCarsCheaperThan(2_600_000));
        assertEquals(3, carShop.numberOfCarsCheaperThan(3_000_000));
    }

    @Test
    void carsWithBrand() {
        assertEquals(2, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("Mazda").size());
    }
}
