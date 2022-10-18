/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.puebatest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cristian Apraez
 */
public class calculadoraTest {
    
    public calculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 5;
        int num2 = 12;
        calculadora instance = new calculadora();
        int expResult = 17;
        int result = instance.sumar(num1, num2);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of restar method, of class calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int num1 = 45;
        int num2 = 11;
        calculadora instance = new calculadora();
        int expResult = 34;
        int result = instance.restar(num1, num2);
        
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of multiplicar method, of class calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 2;
        int num2 = 12;
        calculadora instance = new calculadora();
        int expResult = 24;
        int result = instance.multiplicar(num1, num2);
       
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of dividir method, of class calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 =45 ;
        int num2 = 3;
        calculadora instance = new calculadora();
        int expResult = 15;
        int result = instance.dividir(num1, num2);
        
        if(result!=expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
