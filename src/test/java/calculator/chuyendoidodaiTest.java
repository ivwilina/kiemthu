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
public class chuyendoidodaiTest {
    private chuyendoidodai d1;
    public chuyendoidodaiTest() {
        d1 = new chuyendoidodai();
    }

    @Test
    public void testHaily() {
        d1.setGoc(1852);
        d1.setDvi("Hải lý");
        float expected = 1;
        assertEquals(expected, d1.doidvi());
    }
    @Test
    public void testDam() {
        d1.setGoc((float) 1609.344);
        d1.setDvi("Dặm");
        float expected = 1;
        assertEquals(expected, d1.doidvi());
    }
    @Test
    public void testThuocAnh() {
        d1.setGoc((float) 0.9144);
        d1.setDvi("Thước anh");
        float expected = 1;
        assertEquals(expected, d1.doidvi());
    }
    @Test
    public void testFoot() {
        d1.setGoc((float) 0.3048);
        d1.setDvi("Foot");
        float expected = 1;
        assertEquals(expected, d1.doidvi());
    }
    @Test
    public void testInch() {
        d1.setGoc((float) 0.0254);
        d1.setDvi("Inch");
        float expected = 1;
        assertEquals(expected, d1.doidvi());
    }
    
}
