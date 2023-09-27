/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Manipulation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class StringsTest {
    
    public StringsTest() {
    }

    /**
     * Test of reverseText method, of class Strings.
     */
    @Test
    public void testReverseText() {
        System.out.println("reverseText");
        Strings instance = new Strings();
        String expResult = "avaJ";
        String inputData = "Java";
        instance.setText(inputData);
        String result = instance.reverseText();
        assertEquals(expResult, result);

    }
    @Test
    public void testReverseTextEmptyString(){
        Strings instance = new Strings();
        String inputData = "";
        instance.setText(inputData);
        String expResult = "";
        String actualResult = instance.reverseText();
        assertEquals(expResult, actualResult);
        
    }
    @Test
    public void testReverseTextNullString(){
        Strings instance = new Strings();
        String inputData = null;
        instance.setText(inputData);
        String expResult = null;
        String actualResult = instance.reverseText();
        assertEquals(expResult, actualResult);
        
    }

    /**
     * Test of setText method, of class Strings.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Strings instance = new Strings();
        instance.setText(text);

    }
    
}
