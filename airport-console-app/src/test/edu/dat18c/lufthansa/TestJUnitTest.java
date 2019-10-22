package edu.dat18c.lufthansa;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestJUnitTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testMinus() {
        Minus();
    }

    @Test
    public void Minus(){
        System.out.println("JUnit 5 Test!");
        int a = 20;
        int b = 10;
        TestJUnit test = new TestJUnit();
        int expResult = 10;
        int result = test.testMinus(a,b);
        assertEquals(expResult, result);
    }
}