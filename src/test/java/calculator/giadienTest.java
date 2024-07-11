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
public class giadienTest {
    private giadien g1;
    public giadienTest() {
        g1 = new giadien();
    }

    @Test
    public void testTiendien50() {
        g1.setSodien(30);
        float expected = 54180;
        assertEquals(expected, g1.tiendien());
    }
    
    @Test
    public void testTiendien100() {
        g1.setSodien(130);
        float expected = 248610;
        assertEquals(expected, g1.tiendien());
    }
    
    @Test
    public void testTiendien200() {
        g1.setSodien(230);
        float expected = 482170;
        assertEquals(expected, g1.tiendien());
    }
    
    @Test
    public void testTiendien300() {
        g1.setSodien(330);
        float expected = 764700;
        assertEquals(expected, g1.tiendien());
    }
    
    @Test
    public void testTiendien400() {
        g1.setSodien(430);
        float expected = 1072730;
        assertEquals(expected, g1.tiendien());
    }

    
}
