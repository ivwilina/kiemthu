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
public class dautuTest {
    private dautu d1;
    public dautuTest() {
        d1 = new dautu();
    }

    @Test
    public void testLaidon() {
        d1.setHinhthuc("Lãi đơn");
        d1.setLaisuat(5);
        d1.setThoigian(10);
        d1.setTong(10000000);
        float expected = 15000000;
        assertEquals(expected, d1.tinhtong());
    }
    
    @Test
    public void testLaikep() {
        d1.setHinhthuc("Lãi kép");
        d1.setLaisuat(5);
        d1.setThoigian(10);
        d1.setTong(10000000);
        float expected = (float) 16288946.27;
        assertEquals(expected, d1.tinhtong());
    }

    
}
