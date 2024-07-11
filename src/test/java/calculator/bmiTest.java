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
public class bmiTest {
    private bmi b1;
    public bmiTest() {
        b1 = new bmi();
    }

    @Test
    public void testTinhBMI() {
        b1.setCannang(60);
        b1.setChieucao(176);
        float expected = (float) 19.4;
        assertEquals(expected, b1.tinhBMI());
    }

    @Test
    public void testDanhgia() {
        b1.setCannang(60);
        b1.setChieucao(176);
        String expected = "Bình thường";
        assertEquals(expected, b1.danhgia());
    }
    
}
