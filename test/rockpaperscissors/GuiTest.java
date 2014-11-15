/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit testers for the rock-paper-scissors comparisons to make sure that the
 * logic (rock beats scissors, etc.) works properly
 */
public class GuiTest {

    @Test
    public void testTie() {
        assertEquals(Logic.compareChoices(0, 0), "Tie");
        assertEquals(Logic.compareChoices(1, 1), "Tie");
        assertEquals(Logic.compareChoices(2, 2), "Tie");
    }

    @Test
    public void testUser() {
        assertEquals(Logic.compareChoices(0, 2), "User");
        assertEquals(Logic.compareChoices(1, 0), "User");
        assertEquals(Logic.compareChoices(2, 1), "User");
    }

    @Test
    public void testAI() {
        assertEquals(Logic.compareChoices(0, 1), "AI");
        assertEquals(Logic.compareChoices(1, 2), "AI");
        assertEquals(Logic.compareChoices(2, 0), "AI");
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void testMain() {
//        String[] args = null;
//        gui.main(args);
//        //fail("The test case is a prototype.");
//    }
}
