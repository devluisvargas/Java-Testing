package com.platzi.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void return_fizz_when_is_multiple_only_by_3() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void return_buzz_when_is_multiple_only_by_5() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(20));

    }

    @Test
    public void return_buzz_when_is_multiples_by_5_and_3() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void return_buzz_when_is_not_multiples_by_5_or_3() {
        assertEquals("4",FizzBuzz.fizzBuzz(4));
        assertEquals("8",FizzBuzz.fizzBuzz(8));
        assertEquals("16",FizzBuzz.fizzBuzz(16));

    }


}