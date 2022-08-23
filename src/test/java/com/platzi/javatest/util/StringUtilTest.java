package com.platzi.javatest.util;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class StringUtilTest {
    @Test
    public void repeat_string_once() {

        assertEquals( "hola",StringUtil.repeat("hola", 1));

    }

    @Test
    public void repeat_string_multiple_items(){
        assertEquals("holaholahola",StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        assertEquals("",StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hola",-1);
    }


    @Test
    public void str_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void str_is_not_empty(){
        assertFalse(StringUtil.isEmpty("hola"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void str_is_empty_is_null(){
        StringUtil.isEmpty(null);
    }

    @Test
    public void str_is_blank(){
        assertTrue(StringUtil.isEmpty("        "));
    }
}