package com.platzi.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void prueba() {
        assertEquals("XC",RomanNumerals.arabicToRoman(90));
    }
}