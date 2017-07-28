package com.imie;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @ Test
    public void testUneMethode() {

        assertEquals( 5,5);
    }


    @ Test
    public void testUneMethode2() {
        // test ok
        assertTrue( 5==5);
        // test faux
        //assertTrue( 5==6);
    }
}