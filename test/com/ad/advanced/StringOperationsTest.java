package com.ad.advanced;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationsTest {

    private StringOperations stringOperations;

    @Before
    public void setUp() throws Exception {
        stringOperations = new StringOperations();
    }

    @After
    public void tearDown() throws Exception {
        stringOperations = null;
    }

    @Test
    public void concatString_ShouldNotReturnNull_WhenInputIsNotNull() { //<method>_Should<expected>_When<condition>
        assertNotNull(stringOperations.concatString("Barru", "Maisha"));
    }

    @Test(expected = NullPointerException.class)
    public void concatString_ShouldThrowNullPointerException_WhenInputIsNull() {
        stringOperations.concatString("asdasd", null);
    }


    @Test
    public void verifyStartAndEndStringSame_ShouldReturnTrue_WhenInputHasSameStartAndEndString() { //<method>_Should<expected>_When<condition>
        assertTrue(stringOperations.verifyStartAndEndStringSame("abcxxxabc", "abc"));
    }

    @Test
    public void verifyStartAndEndStringSame_ShouldReturnFalse_WhenInputNotHaveSameStartAndEndString() { //<method>_Should<expected>_When<condition>
        assertFalse(stringOperations.verifyStartAndEndStringSame("abcxxxabc", "ab"));
    }
}