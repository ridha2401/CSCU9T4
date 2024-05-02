package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for CycleEntry to verify functionality of CycleEntry specific methods.
 */
public class CycleEntryTest {

    private CycleEntry instance;

    @BeforeEach
    public void setUp() {
        // Setup the CycleEntry instance before each test
        instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3.0f, "asphalt", "moderate");
    }

    /**
     * Test of getName method, of class CycleEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result, "Name should match the expected result.");
    }

    /**
     * Test of getDay method, of class CycleEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("Testing getDay");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result, "Day should match the expected result.");
    }

    /**
     * Test of getMonth method, of class CycleEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("Testing getMonth");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result, "Month should match the expected result.");
    }

    /**
     * Test of getYear method, of class CycleEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("Testing getYear");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result, "Year should match the expected result.");
    }

    /**
     * Test of getHour method, of class CycleEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("Testing getHour");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result, "Hour should match the expected result.");
    }

    /**
     * Test of getMin method, of class CycleEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("Testing getMin");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result, "Minutes should match the expected result.");
    }

    /**
     * Test of getSec method, of class CycleEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("Testing getSec");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result, "Seconds should match the expected result.");
    }

    /**
     * Test of getDistance method, of class CycleEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("Testing getDistance");
        float expResult = 3.0f;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0, "Distance should match the expected result.");
    }
    
    /**
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        System.out.println("Testing getTerrain");
        String expResult = "asphalt";
        String result = instance.getTerrain();
        assertEquals(expResult, result, "Terrain should match the expected result.");
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        System.out.println("Testing getTempo");
        String expResult = "moderate";
        String result = instance.getTempo();
        assertEquals(expResult, result, "Tempo should match the expected result.");
    }
    
    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("Testing getEntry");
        String expResult = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo\n";
        String result = instance.getEntry();
        assertEquals(expResult, result, "Entry output should match the expected result.");
    }
}
