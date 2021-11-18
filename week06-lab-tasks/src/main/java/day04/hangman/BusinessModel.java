package day04.hangman;

public class BusinessModel {
    private String wordToFind;
    private String wordFound;
    private int chances;

    public BusinessModel(String wordToFind, int chances) {
        this.wordToFind = wordToFind;
        this.wordFound = "_".repeat(wordToFind.length());
        this.chances = chances;
    }

    public boolean takeGuess(String guess) {
        if (wordToFind.contains(guess)) {
            wordFound = updateWordFound(wordToFind, wordFound, guess);
            return true;
        }
        else {
            chances--;
        }
        return false;
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

    public String getWordFound() {
        return wordFound;
    }

    public int getChances() {
        return chances;
    }

    public boolean won() {
        return wordToFind.equals(wordFound);
    }

    public boolean hasMoreChance() {
        return chances > 0;
    }
}
