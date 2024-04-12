package org.simplify4u.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LombokValueTest {

    @Test
    void test() {
        LombokValue test1 = new LombokValue("1", "2");
        LombokValue test2 = new LombokValue("1", "2");
        assertNotNull(test1);
        assertEquals("1", test1.getTest1());
        assertTrue(test1.toString().contains("test1"));
        assertEquals(test1, test2);
    }

}