/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package preparingcode;

import java.time.LocalDateTime;
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
public class TestableCodeTest {
    
    private static TestableCode tc = new TestableCode();
    
    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting(){
        String name = "Noah";
        String outcome = "I don't know you, Noah. But you are on our VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }
    
    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting(){
        String name = "Tess";
        String outcome = "I know you, Tess. You're even on our VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }
    
    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting(){
        String name = "Sascha";
        String outcome = "stranger";
        assertEquals(outcome, tc.greetUser(name));
    }
    
    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart(){
        LocalDateTime dateTime = LocalDateTime.of(2022, 5, 6, 16, 50);
        String outcome = "Good afternoon, ";        
        assertEquals(outcome, tc.greetDay(dateTime));   
    }
    
}
