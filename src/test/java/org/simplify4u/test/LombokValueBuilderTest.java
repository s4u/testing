package org.simplify4u.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LombokValueBuilderTest {

    @Test
    void test() {
        LombokValueBuilder test1 = new LombokValueBuilder("1", "2");
        LombokValueBuilder test2 = new LombokValueBuilder("1", "2");
        assertNotNull(test1);
        assertEquals("1", test1.getTest1());
        assertTrue(test1.toString().contains("test1"));
        assertEquals(test1, test2);
    }

}