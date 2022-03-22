
import java.time.DayOfWeek;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MC03353
 */

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTestTest {
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
    
}
