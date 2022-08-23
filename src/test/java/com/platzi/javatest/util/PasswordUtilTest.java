package com.platzi.javatest.util;

import org.junit.Test;

import static com.platzi.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("12345a!"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("holasdasdasaasdkdasad"));
    }

    @Test
    public void medium_when_has_letters_and_number() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("holaskda121212123"));
    }

    @Test
    public void strong_when_has_letters_and_number_and_symbols() {
        assertEquals(STRONG,PasswordUtil.assessPassword("holaskda123!"));
    }
}
