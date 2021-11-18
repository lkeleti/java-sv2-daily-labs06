package day03;

import java.util.Random;

public class FiveRandomNumber {
    public int[] generateFiveRandomNumberArray() {
        int[] numbers = new int[5];
        int counter = 0;
        Random random = new Random();

        while (counter < 5){
            int randomNumber = random.nextInt(1,100);
            if (randomNumber % 2 == 1) {
                numbers[counter] = randomNumber;
                counter++;
            }
        }
        return numbers;
    }
}
