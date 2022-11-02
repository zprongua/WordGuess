package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {

    //Given
    //When
    //Then

    @Test
    public void testCatStuff() {
        String expectedName = "Heathcliff";
        int expectedAge = 7;
        int expectedWeight = 23;
        Cat hc = new Cat(expectedName, expectedAge, expectedWeight);
        String actualName = hc.getName();
        Assert.assertEquals(expectedName, actualName);
    }
}
