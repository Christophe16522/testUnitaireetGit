/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heure;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITU
 */
public class FonctionDateTest {
    
    public FonctionDateTest() {
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

    

    /**
     * Test of isValidDate method, of class FonctionDate.
     */
    @Test
    public void testIsValidDate() throws Exception {
        System.out.println("isValidDate");
        String dateString = "2017-01-01";
        boolean expResult = true;
        boolean result = FonctionDate.isValidDate(dateString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidTime method, of class FonctionDate.
     */
    @Test
    public void testIsValidTime() throws Exception {
        System.out.println("isValidTime");
        String timeString = "09:09";
        boolean expResult = true;
        boolean result = FonctionDate.isValidTime(timeString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of retToHentre method, of class FonctionDate.
     */
    @Test
    public void testRetToHentre() throws Exception {
        System.out.println("retToHentre");
        int nbrRet = 1;
        int totalRet = 60;
        String heureDebut = "08:00";
        String expResult = "09:00";
        String result = FonctionDate.retToHentre(nbrRet, totalRet, heureDebut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
