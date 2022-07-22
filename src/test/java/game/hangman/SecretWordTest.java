package game.hangman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SecretWordTest {
    private SecretWord secretWord;

    @Before
    public void init() {
        secretWord = new SecretWord("hola");
    }

    @Test
    public void shouldAddUpperCaseLetter() {
        assertTrue(secretWord.AddLetter('A'));
    }

}