/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2;

import examenUF2.Pila;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduard
 */
public class PilaTest {

    public PilaTest() {
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
     * Test afegim un nou enter superior a 0, resultat esperat: l'enter que
     * afegim.
     */
    @Test
    public void testAfegir() {
        System.out.println("Afegim un nou enter positiu");
        int el = 3;
        Pila instance = new Pila();
        int expResult = 3;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Afegim el número 0 que no el considarem com a positiu, resultat esperat:
     * 0.
     */
    @Test
    public void testAfegir2() {
        System.out.println("Afegim un 0");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Afegim el número -3, com que no és un número positiu ens ha de retornar
     * 0. resultat esperat: 0.
     */
    @Test
    public void testAfegir3() {
        System.out.println("Afegim un número negatiu");
        int el = -3;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Sobrepassem la taula, per tant no ens deixa introduïr més valors.
     * resultat esperat: 0, ja que no podem afegir més valors.
     */
    @Test
    public void testAfegir4() {
        System.out.println("Accedim el límit de l'array.");
        int el = 3;
        Pila instance = new Pila();
        int expResult = 3;
        for (int i = 0; i <= 100; i++) {
            el = 3;
        }
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Sobrepassem la taula, per tant no ens deixa introduïr més valors.
//     * resultat esperat: 0, ja que no podem afegir més valors.
//     */
    @Test
    public void testAfegir5() {
        System.out.println("Introduïm un enter a una posició fora de l'array.");
        int el = 3;
        Pila instance = new Pila();
        int expResult = 0;
        for (int i = -3; i < -2; i++) {
            el = 0;
        }
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
