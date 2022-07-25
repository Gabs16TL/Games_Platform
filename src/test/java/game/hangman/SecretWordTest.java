package game.hangman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SecretWordTest {
    private String word = "hello";
    private SecretWord secretWord;

    @Before
    public void init() {
        secretWord = new SecretWord(word);
    }

    @Test
    public void shouldIgnoreLetterCase() {
        assertTrue(secretWord.AddLetter(word.toUpperCase().charAt(0)));
    }

    @Test
    public void shouldIgnoreCharactersOrder() {
        for (int i = (word.length() - 1); i >= 0; i--) {
            secretWord.AddLetter(word.charAt(i));
        }
        assertTrue(secretWord.isGuessed());
    }

}