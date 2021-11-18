package day04.hangman;

import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("szarvasmarha", 8);
        Scanner scanner = new Scanner(System.in);
        do {
            printStatus(businessModel);
            String guess = inputGuess(scanner);
            boolean success = businessModel.takeGuess(guess);
            printResult(success, "Jó!", "Rossz!");
        }
        while(!(businessModel.won()) && businessModel.hasMoreChance());

        printResult(businessModel.won(), "Ügyes!", "Vesztettél!");
    }

    private void printResult(boolean won, String s, String s2) {
        if (won) {
            System.out.println(s);
        } else {
            System.out.println(s2);
        }
    }

    private void printStatus(BusinessModel businessModel) {
        System.out.println("Itt tartasz: " + businessModel.getWordFound());
        System.out.println("Ennyi tipped van még: " + businessModel.getChances());
    }

    private String inputGuess(Scanner scanner) {
        System.out.print("Mi a következő tipped? ");
        return scanner.nextLine();
    }
}
