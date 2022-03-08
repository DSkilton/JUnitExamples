/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MC03353
 */
public class CalculateMethodsTest {
    
    
    
    private CalculateMethods calculateMethods = new CalculateMethods();
    
    @Test
    public void testDivide(){
        Assertions.assertEquals(10, calculateMethods.divide(100, 10));
    }
    
    @Test
    public void testDivideByZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100,0));
    }
    
}
