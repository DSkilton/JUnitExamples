
import java.time.DayOfWeek;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author MC03353
 */

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTestTest {
    
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)// can be used at top of class too
    public void testDepositTimeoutAssertion(BankAccount bankAccount){
        try{
            Thread.sleep(200);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        bankAccount.deposit(300);
        assertEquals(300, bankAccount.getBalance());
    }
    
    @ParameterizedTest
    @ValueSource(ints = {100, 400, 800, 1000})
    @DisplayName("Depositing successfully")
    public void testDeposit(int amount, BankAccount bankAccount){
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());
    } 
    
    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY", "THURSDAY"})
    public void testDayOfWeek(DayOfWeek day){
        assertTrue(day.toString().startsWith("T"));
        
    }
    
    @ParameterizedTest
//    @CsvSource({"100, Mary", "200, Rachid", "150, Ted"})
    @CsvFileSource(resources = "details.csv")
    public void depositAndNameTest(double amount, String name, BankAccount bankAccount){
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());   
    }
    
}
