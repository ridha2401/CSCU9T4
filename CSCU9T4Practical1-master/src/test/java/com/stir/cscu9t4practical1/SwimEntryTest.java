package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwimEntryTest {
    
    private SwimEntry instanceA;
    private SwimEntry instanceB;

    @BeforeEach
    public void setUp() {
        instanceA = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3.0f, "outdoors");
        instanceB = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3.0f, "pool");
    }

    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expResult = "Alice";
        String result = instanceA.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDay() {
        System.out.println("Testing getDay");
        int expResult = 1;
        int result = instanceA.getDay();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMonth() {
        System.out.println("Testing getMonth");
        int expResult = 2;
        int result = instanceA.getMonth();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("Testing getYear");
        int expResult = 2003;
        int result = instanceA.getYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHour() {
        System.out.println("Testing getHour");
        int expResult = 0;
        int result = instanceA.getHour();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMin() {
        System.out.println("Testing getMin");
        int expResult = 16;
        int result = instanceA.getMin();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSec() {
        System.out.println("Testing getSec");
        int expResult = 7;
        int result = instanceA.getSec();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance() {
        System.out.println("Testing getDistance");
        float expResult = 3.0F;
        float result = instanceA.getDistance();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetWhere() {
        System.out.println("Testing getWhere");
        String expResultA = "outdoors";
        String resultA = instanceA.getWhere();
        assertEquals(expResultA, resultA);
        
        String expResultB = "in a pool";
        String resultB = instanceB.getWhere();
        assertEquals(expResultB, resultB);
    }

    @Test
    public void testGetEntry() {
        System.out.println("Testing getEntry");
        String expResult = "Alice swam 3.0 km outdoors in 0:16:7 on 1/2/2003\n";
        String result = instanceA.getEntry();
        assertEquals(expResult, result);
    }
    
}
