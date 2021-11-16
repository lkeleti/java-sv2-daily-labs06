package day02.numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number){
        int sumOfDivider = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivider += i;
            }
        }

        return sumOfDivider == number;
    }
}
