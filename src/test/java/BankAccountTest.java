/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author MC03353
 */
@DisplayName("Test BankAccount Class")
public class BankAccountTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());
    }
    
    @Test
    @DisplayName("withdrawel will will become negative")
    public void testWithdrawNotStuckAtZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800); 
        assertNotEquals(0, bankAccount.getBalance());
    }
    
    @Test
    @DisplayName("Test activation account after creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTrue(bankAccount.isActive());
    }
    
    @Test
    @DisplayName("Test set holder name")
    public void testHolderNameSet(){
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setHolderName("Duncan");
        assertNotNull(bankAccount.getHolderName());
    }
    
    @Test
    @DisplayName("Tese that we cannot withdraw below minimum")
    public void testNoWithdrawBelowMinimum(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }
    
    @Test
    @DisplayName("Test no exceptions for withdraw and deposit")
    public void testWithdrawAndDepositWithoutException(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(-1000));
    }
    
    @Test
    @DisplayName("Test speed deposit")
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(400, 0);
        assertTimeout(Duration.ofNanos(1), () -> bankAccount.deposit(200));
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

    /**
     * Test of isActive method, of class BankAccount.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        BankAccount instance = null;
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHolderName method, of class BankAccount.
     */
    @Test
    public void testGetHolderName() {
        System.out.println("getHolderName");
        BankAccount instance = null;
        String expResult = "";
        String result = instance.getHolderName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHolderName method, of class BankAccount.
     */
    @Test
    public void testSetHolderName() {
        System.out.println("setHolderName");
        String holderName = "";
        BankAccount instance = null;
        instance.setHolderName(holderName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
