/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonction;

import Mapping.Employer;
import Mapping.Ferier;
import Mapping.Horaire;
import Mapping.InfosEmp;
import Mapping.Poste;
import Mapping.Retenue;
import Mapping.Salaire;
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
public class FonctionTest {
    
    public FonctionTest() {
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
     * Test of countFerier method, of class Fonction.
     */
    @Test
    public void testCountFerier() {
        System.out.println("countFerier");
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countFerier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSalaire method, of class Fonction.
     */
    @Test
    public void testCountSalaire() {
        System.out.println("countSalaire");
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countSalaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countPoste method, of class Fonction.
     */
    @Test
    public void testCountPoste() {
        System.out.println("countPoste");
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countPoste();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countHoraire method, of class Fonction.
     */
    @Test
    public void testCountHoraire() {
        System.out.println("countHoraire");
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countHoraire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empExistByidName method, of class Fonction.
     */
    @Test
    public void testEmpExistByidName() {
        System.out.println("empExistByidName");
        int id = 0;
        String name = "";
        boolean expResult = false;
        boolean result = Fonction.empExistByidName(id, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countEmployer method, of class Fonction.
     */
    @Test
    public void testCountEmployer() {
        System.out.println("countEmployer");
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countEmployer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countRetenue method, of class Fonction.
     */
    @Test
    public void testCountRetenue() {
        System.out.println("countRetenue");
        String idEmp = "";
        String dateDebut = "";
        String dateFin = "";
        Fonction instance = new Fonction();
        int expResult = 0;
        int result = instance.countRetenue(idEmp, dateDebut, dateFin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectFerier method, of class Fonction.
     */
    @Test
    public void testSelectFerier() {
        System.out.println("selectFerier");
        Fonction instance = new Fonction();
        Ferier[] expResult = null;
        Ferier[] result = instance.selectFerier();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectEmployer method, of class Fonction.
     */
    @Test
    public void testSelectEmployer() {
        System.out.println("selectEmployer");
        Fonction instance = new Fonction();
        Employer[] expResult = null;
        Employer[] result = instance.selectEmployer();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectRetenue method, of class Fonction.
     */
    @Test
    public void testSelectRetenue() {
        System.out.println("selectRetenue");
        String idEmp = "";
        String dateDebut = "";
        String dateFin = "";
        Fonction instance = new Fonction();
        Retenue[] expResult = null;
        Retenue[] result = instance.selectRetenue(idEmp, dateDebut, dateFin);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of firstPoint method, of class Fonction.
     */
    @Test
    public void testFirstPoint() {
        System.out.println("firstPoint");
        String idEmp = "";
        int expResult = 0;
        int result = Fonction.firstPoint(idEmp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntrer method, of class Fonction.
     */
    @Test
    public void testGetEntrer() {
        System.out.println("getEntrer");
        String idEmp = "";
        String expResult = "";
        String result = Fonction.getEntrer(idEmp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortie method, of class Fonction.
     */
    @Test
    public void testGetSortie() {
        System.out.println("getSortie");
        String idEmp = "";
        String expResult = "";
        String result = Fonction.getSortie(idEmp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPresence method, of class Fonction.
     */
    @Test
    public void testInsertPresence() {
        System.out.println("insertPresence");
        String idEmp = "";
        String type = "";
        String heure = "";
        String date = "";
        Fonction.insertPresence(idEmp, type, heure, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertEmployer method, of class Fonction.
     */
    @Test
    public void testInsertEmployer() {
        System.out.println("insertEmployer");
        int idsal = 0;
        int idhor = 0;
        int idpos = 0;
        String nom = "";
        String cin = "";
        String sexe = "";
        Fonction.insertEmployer(idsal, idhor, idpos, nom, cin, sexe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canPoint method, of class Fonction.
     */
    @Test
    public void testCanPoint() throws Exception {
        System.out.println("canPoint");
        String idEmp = "";
        String heureAriver = "";
        boolean expResult = false;
        boolean result = Fonction.canPoint(idEmp, heureAriver);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectSalaire method, of class Fonction.
     */
    @Test
    public void testSelectSalaire() {
        System.out.println("selectSalaire");
        Fonction instance = new Fonction();
        Salaire[] expResult = null;
        Salaire[] result = instance.selectSalaire();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectPoste method, of class Fonction.
     */
    @Test
    public void testSelectPoste() {
        System.out.println("selectPoste");
        Fonction instance = new Fonction();
        Poste[] expResult = null;
        Poste[] result = instance.selectPoste();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectHoraire method, of class Fonction.
     */
    @Test
    public void testSelectHoraire() {
        System.out.println("selectHoraire");
        Fonction instance = new Fonction();
        Horaire[] expResult = null;
        Horaire[] result = instance.selectHoraire();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectInfosEmp method, of class Fonction.
     */
    @Test
    public void testSelectInfosEmp() {
        System.out.println("selectInfosEmp");
        Fonction instance = new Fonction();
        InfosEmp[] expResult = null;
        InfosEmp[] result = instance.selectInfosEmp();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
