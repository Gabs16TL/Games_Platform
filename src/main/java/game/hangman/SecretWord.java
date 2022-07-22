package game.hangman;

public class SecretWord {
    public char[] secretWord;
    public char[] guessedWord;

    public SecretWord(String secretWord) {
        this.secretWord = secretWord.toCharArray();
    }

    public boolean AddLetter(Character letter) {
        return false;
    }

    public boolean isGuesser() {
        return true;
    }

    public void GuessedWord() {

    }
}
