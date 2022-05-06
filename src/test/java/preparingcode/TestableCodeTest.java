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
        assertTrue(tc.greetUser(name).contains("VIP"));
    }
    
    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting(){
        String name = "Sascha";
        assertTrue(tc.greetUser(name).contains("stranger"));
    }
    
    public void testDayPart(){
        String dayPart = "";
        LocalDateTime dateTime = LocalDateTime.now();
        
        if(dateTime.getHour() >= 0 && dateTime.getHour() < 6){
            dayPart += "Good night, ";
        }
        
        if(dateTime.getHour() >= 6 && dateTime.getHour() < 12){
            dayPart += "Good morning, ";
        }
        
        if(dateTime.getHour() >= 12 && dateTime.getHour() < 18){
            dayPart += "Good afternoon, ";
        }
        
        if(dateTime.getHour() >= 18 && dateTime.getHour() < 23){
            dayPart += "Good evening, ";
        }
        
        assertTrue(tc.greetUser("anyName").contains(dayPart));   
    }
    
}
