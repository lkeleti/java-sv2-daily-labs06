package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxLimit;
    List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxLimit) {
        this.name = name;
        this.maxLimit = maxLimit;
    }

    public String getName() {
        return name;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public List<Car> getCarsForSell() {
        return List.copyOf(cars);
    }

    public boolean addCar(Car car){
        if (car.getPrice() <= maxLimit) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice(){
        int sumOfPrice = 0;

        for (Car car: cars) {
            sumOfPrice += car.getPrice();
        }
        return sumOfPrice;
    }

    public int numberOfCarsCheaperThan(int price){
        int counter = 0;

        for (Car car: cars) {
            if (car.getPrice() <= price) {
                counter++;
            }
        }
        return counter;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> brandList = new ArrayList<>();

        for (Car car: cars){
            if (car.getBrand().equals(brand)){
                brandList.add(car);
            }
        }
        return brandList;
    }
}
