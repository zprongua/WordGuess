package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {

    @Test
    public void testHangman() {
        Hangman hm = new Hangman();
        hm.initializeGameState();

        Assert.assertEquals(3, hm.givenWord.length);
    }

    @Test
    public void testDisplayWord() {
        Hangman hm = new Hangman();
        hm.initializeGameState();

        String act = hm.printArray(hm.displayWord);
        String exp = "_ _ _ ";
        String given = hm.printArray(hm.givenWord);

        Assert.assertEquals(exp, act);
        Assert.assertNotEquals(act, given);
    }

    @Test
    public void testWordGuessed() {
        Hangman hm = new Hangman();
        hm.initializeGameState();

        Assert.assertFalse(hm.isWordGuessed());
    }
}
