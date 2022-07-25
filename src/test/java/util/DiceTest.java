package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void shouldNotBeLessThanZero() {
        assertEquals(0, Dice.generateValue(0));
    }
}