package game.hangman;

public class HangedMan {
    public int ATTEMPTS = 8;
    public int FailedAttempts;
    private final SecretWord secretWord;

    public HangedMan(String secretWord) {
        this.secretWord = new SecretWord(secretWord);
    }

    public void PaintHangedMan() {

    }

    public void isDead() {

    }

    public void paintFigure() {

    }

    public boolean isSaved() {
        return false;
    }

    public boolean isHanged() {
        return false;
    }

    public boolean addLetter(char givenLetter) {
        return false;
    }

    public void addPart() {

    }
}
