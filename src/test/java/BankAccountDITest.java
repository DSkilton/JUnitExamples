
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MC03353
 */

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
    
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
