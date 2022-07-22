package game.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HangedManTest {
    private String secretWord;
    private HangedMan hangedMan;

    @Before
    public void init() {
        secretWord = "hello";
        hangedMan = new HangedMan(secretWord);
    }

    @Test
    public void shouldBeSavedWhenFindsTheWord() {
        for (char letter : secretWord.toCharArray()) {
            hangedMan.tryLetter(letter);
        }
        assertTrue(hangedMan.isSaved());
    }

    @Test
    public void shouldBeDeadWhenReachLimitOfAttempts() {
        for (char letter : secretWord.toCharArray()) {
            hangedMan.tryLetter(' '); hangedMan.tryLetter(' ');
        }
        assertTrue(hangedMan.isDead());
    }

}