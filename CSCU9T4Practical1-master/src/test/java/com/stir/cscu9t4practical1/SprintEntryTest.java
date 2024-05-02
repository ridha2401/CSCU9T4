package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for SprintEntry to verify functionality of SprintEntry specific methods.
 */
public class SprintEntryTest {
    
    private SprintEntry instance;

    @BeforeEach
    public void setUp() {
        // Initialize a SprintEntry object before each test
        instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
    }

    /**
     * Test of getName method, of class SprintEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class SprintEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("Testing getDay");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class SprintEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("Testing getMonth");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class SprintEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("Testing getYear");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class SprintEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("Testing getHour");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class SprintEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("Testing getMin");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class SprintEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("Testing getSec");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class SprintEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("Testing getDistance");
        float expResult = 300; // Note the correct expected result
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getRepetitions method of class SprintEntry.
     */
    @Test
    public void testGetRepetitions() {
        System.out.println("Testing getRepetitions");
        int expResult = 4; // Correct variable name
        int result = instance.getRepetitions();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getRecovery method of class SprintEntry.
     */
    @Test
    public void testGetRecovery() {
        System.out.println("Testing getRecovery");
        int expResult = 2; // Correct variable name
        int result = instance.getRecovery();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class SprintEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("Testing getEntry");
        String expResult = "Alice sprinted 4x300m in 0:16:7 with 2 minutes recovery on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }
}
