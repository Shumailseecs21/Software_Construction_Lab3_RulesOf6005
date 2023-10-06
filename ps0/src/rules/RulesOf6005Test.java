/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        // adding test case 1
        //Code is not written by yourself, not available to others, part of coursework, no proper citation, and implementation is not required.
        assertFalse("Expected false: code from coursework without implementation requirement",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, false, false));       
        //adding test case 2
        //Code is not written by yourself, not available to others, and implementation is required.
        assertFalse("Expected false: implementation-required code not available to others",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, true));
    }
}
