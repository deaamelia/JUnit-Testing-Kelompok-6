/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbangundatar;

import luasbangundatar.LuasBangunDatar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rudi
 */
public class LuasBangunDatarTest {
    
    public LuasBangunDatarTest() {
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
     * Test of persegi method, of class LuasBangunRuang.
     */
    @Test
    public void testPersegi() {
        System.out.println("persegi");
        double s = 5.0;
        LuasBangunDatar instance = new LuasBangunDatar();
        double expResult = 25.0;
        double result = instance.persegi(s);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of persegi_panjang method, of class LuasBangunRuang.
     */
    @Test
    public void testPersegi_panjang() {
        System.out.println("persegi_panjang");
        double p = 3.0;
        double l = 10.0;
        LuasBangunDatar instance = new LuasBangunDatar();
        double expResult = 30.0;
        double result = instance.persegi_panjang(p, l);
        assertEquals(expResult, result, 0.0);
        
    }
    
    

    /**
     * Test of segitiga method, of class LuasBangunRuang.
     */
    @Test
    public void testSegitiga() {
        System.out.println("segitiga");
        double a = 4.0;
        double t = 10.0;
        LuasBangunDatar instance = new LuasBangunDatar();
        double expResult = 20.0;
        double result = instance.segitiga(a, t);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of jajar_genjang method, of class LuasBangunRuang.
     */
    @Test
    public void testJajar_genjang() {
        System.out.println("jajar_genjang");
        double a = 6.0;
        double t = 4.0;
        LuasBangunDatar instance = new LuasBangunDatar();
        double expResult = 24.0;
        double result = instance.jajar_genjang(a, t);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of main method, of class LuasBangunRuang.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LuasBangunDatar.main(args);
       
    }
    
}
