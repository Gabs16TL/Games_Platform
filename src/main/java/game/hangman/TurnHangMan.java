package game.hangman;

import game.GamePlayer;

public class TurnHangMan {
    private HangManPlayer wordGiver;
    private HangManPlayer wordGuesser;
    private HangManPlayer result;
    private HangedMan hangedMan;

    public TurnHangMan(GamePlayer wordGiver, GamePlayer wordGuesser) {
        this.wordGiver = wordGiver;
        this.wordGuesser = wordGuesser;
    }

    public void play() {
        String secretWord = wordGiver.chooseWord();
        hangedMan = new HangedMan(secretWord);
        hangedMan.paintHangedMan();
        while (!hangedMan.isSaved() && !hangedMan.isDead()) {
            char givenLetter = wordGuesser.giveLetter();
            hangedMan.tryLetter(givenLetter);
            hangedMan.paintHangedMan();
            System.out.println();
        }
        if (hangedMan.isSaved()) this.result = wordGuesser;
        else this.result = wordGiver;
    }

    public HangManPlayer getResult() {
        return this.result;
    }
}
