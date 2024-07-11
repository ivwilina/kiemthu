/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
public class maytinhthuongTest {
    private maytinhthuong cacl;
    public maytinhthuongTest() {
        cacl = new maytinhthuong();
    }

    @Test
    public void testGiaiPT() {
        cacl.setA(2);
        cacl.setB(-3);
        cacl.setC(1);
        float delta = cacl.delta();
        String expected = "PT co nghiem kep" ;
         assertEquals(expected, cacl.giaiPT());
    }
    
}
