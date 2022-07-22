package game.hangman;

public class HangedMan {
    private int failedAttemps = 0;
    private final SecretWord secretWord;

    public HangedMan(String secretWord) {
        this.secretWord = new SecretWord(secretWord);
    }

    public void paintHangedMan() {
        System.out.println("  ____");
        System.out.println("  |  |");
        if (failedAttemps > 0) {
            System.out.println("  |  O");
            if (failedAttemps == 2) System.out.println("  |  |");
            else if (failedAttemps == 3) System.out.println("  | \\|");
            else if (failedAttemps >= 4) System.out.println("  | \\|/");
            if (failedAttemps == 5) System.out.println("  | /");
            else if (failedAttemps == 6) System.out.println("  | / \\");
        }
        for (int k = 6 - failedAttemps; k > 0; k--)
            System.out.println("  |");
        System.out.println("__|__");
        System.out.println();
        secretWord.printWord();
    }

    public boolean isSaved() {
        return secretWord.isGuessed();
    }

    public boolean isDead() {
        return failedAttemps >= 6;
    }

    private void addPart() {
        failedAttemps++;
    }

    public void tryLetter(char givenLetter) {
        if (!secretWord.AddLetter(givenLetter))
            addPart();
    }
}
