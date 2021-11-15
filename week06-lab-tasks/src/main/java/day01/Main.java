package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        while ((number = scanner.nextDouble()) > 0) {
            positiveNumberContainer.addNumber(number);
        }
        for (double i: positiveNumberContainer.getNumbers()) {
            System.out.println(i);
        }
    }
}
