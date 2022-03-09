/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MC03353
 */
public class BankAccountTest {
    
    public BankAccountTest() {
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
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.deposit(amount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class BankAccount.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 0.0;
        BankAccount instance = null;
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimumBalance method, of class BankAccount.
     */
    @Test
    public void testGetMinimumBalance() {
        System.out.println("getMinimumBalance");
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.getMinimumBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinimumBalance method, of class BankAccount.
     */
    @Test
    public void testSetMinimumBalance() {
        System.out.println("setMinimumBalance");
        double minimumBalance = 0.0;
        BankAccount instance = null;
        instance.setMinimumBalance(minimumBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
