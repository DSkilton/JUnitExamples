
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MC03353
 */
public class BankAccountConditionalTest {
    //aditional system and environment variables
    //@EnabledIfSystemProperty(named = "os.version", matces = "x")
    //@DisabledIfSystemProperty(named = "os.version", matces = "x")
    //@EnabledIfEnvironmentVariable(named = "USERNAME", matces = "some name")

    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac() {

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_15})
    public void testJRE() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_9})
    public void testNoJRE16() {

    }
}
