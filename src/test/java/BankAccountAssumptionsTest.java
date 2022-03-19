/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author MC03353
 */

public class BankAccountAssumptionsTest {
    
    @Test
    @DisplayName("Test activation after creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, 0);
        assumeTrue(bankAccount != null);
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActive()));
        assertTrue(bankAccount.isActive());
    }
    
}
