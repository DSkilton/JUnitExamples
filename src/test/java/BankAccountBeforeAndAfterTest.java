
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MC03353
 */
public class BankAccountBeforeAndAfterTest {
    static BankAccount bankAccount;
    
    @BeforeAll
    public static void prepTest(){
        bankAccount = new BankAccount(500, 0);
    }
    
    @Test
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    
    @Test
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
    
    @AfterAll
    public static void endTest(){
        System.out.println("Finished");
    }

}
