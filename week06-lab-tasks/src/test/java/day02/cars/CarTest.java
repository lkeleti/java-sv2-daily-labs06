package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carShopTest() {
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        CarShop carShop = new CarShop("Best Car", 10_000_000);

        assertEquals("Best Car", carShop.getName());
        assertEquals(10_000_000, carShop.getMaxLimit());

        assertTrue(carShop.addCar(car1));  //true
        assertEquals(1,carShop.getCarsForSell().size()); //1

        assertFalse(carShop.addCar(car2));  //false
        assertEquals(1, carShop.getCarsForSell().size()); //1

        car1.decreasePrice(10);

        assertEquals(2070000, carShop.getCarsForSell().get(0).getPrice()); //2070000

        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);

        carShop.addCar(car3);
        carShop.addCar(car4);

        assertEquals(Color.GREY, carShop.getCarsForSell().get(2).getColor());
        assertEquals(1.4, carShop.getCarsForSell().get(2).getEngineSize());

        assertEquals(6270000, carShop.sumCarPrice()); //6270000

        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000)); //1

        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000)); //0

        assertEquals(2, carShop.carsWithBrand("Toyota").size()); //2

        assertEquals(0, carShop.carsWithBrand("BMW").size()); //0
    }
}
