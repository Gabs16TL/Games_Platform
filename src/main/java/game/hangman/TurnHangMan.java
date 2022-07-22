package game.hangman;

import game.GamePlayer;

public class TurnHangMan {
    private HangManPlayer wordGiver;
    private HangManPlayer wordGuesser;
    private HangedMan hangedMan;

    public TurnHangMan(GamePlayer wordGiver, GamePlayer wordGuesser) {
        this.wordGiver = wordGiver;
        this.wordGuesser = wordGuesser;
    }

    public void play() {
        String secretWord = wordGiver.chooseWord();
        hangedMan = new HangedMan(secretWord);
        hangedMan.paintFigure();
        while (!hangedMan.isSaved() && !hangedMan.isHanged()) {
            char givenLetter = wordGuesser.giveLetter();
            if (!hangedMan.addLetter(givenLetter)) {
                hangedMan.addPart();
            }
            hangedMan.paintFigure();
            System.out.println();
        }
    }

    public boolean getResult() {
        return false;
    }
}
