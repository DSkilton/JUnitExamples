/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparingcode;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author MC03353
 */
public class TestableCode {
    public static String[] knownNames = {"Zeynep", "Tess", "Marina", "Jade", "Eric", "Jamal"};
    public static String[] specialNames = {"Zach", "Martin", "Noah", "Tess"};
    public String greeting = "";

    public String greetUser(String name) {
        String greetUser = "";

        if (Arrays.stream(knownNames).anyMatch(name::equals)) {
            greetUser += "I know you, " + name + ". ";
            if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greetUser += "You're even on our VIP list!";
            }
        } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
            greetUser += "I don't know you, " + name + ". But you are on our VIP list!";
        } else {
            greetUser += "Stranger";
        }
        return greetUser;
    }

    public String greetDay() {
        LocalDateTime dateTime = LocalDateTime.now();

        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            greeting += "Good night, ";

            if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
                greeting += "Good night, ";
            }

            if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
                greeting += "Good night, ";
            }
            
            if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
                greeting += "Good night, ";
            }
        }
        return greeting;
    }

}
