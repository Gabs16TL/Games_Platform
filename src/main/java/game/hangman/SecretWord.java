package game.hangman;

import java.util.Arrays;

public class SecretWord {
    public char[] secretWord;
    public char[] guessedWord;

    public SecretWord(String secretWord) {
        this.secretWord = secretWord.toCharArray();
        this.guessedWord = new char[this.secretWord.length];
    }

    public boolean AddLetter(char letter) {
        boolean result = false;
        for (int i = 0; i < secretWord.length; i++) {
            if (secretWord[i] == letter) {
                guessedWord[i] = letter;
                result = true;
            }
        }
        return result;
    }

    public boolean isGuessed() {
        return Arrays.equals(secretWord, guessedWord);
    }

    public void printWord() {
        for (char letter : guessedWord)
            System.out.print(letter + " ");
        System.out.println();
        for (char c : guessedWord)
            System.out.print("- ");
        System.out.println();
    }

}
