/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author vugia
 */
public class loginTest {
    private login log;

    @BeforeEach
    public void setUp() {
        log = new login();
    }

    @Test
    public void Dang_nhap_thanhcong() {
        boolean result = log.login("admin", "123");
        assertTrue(result, "Dang nhap thanh cong");
    }

    @Test
    public void Sai_mk() {
        boolean result = log.login("admin", "wrongpassword");
        assertFalse(result, "Dang nhap that bai do sai mat khau");
    }

    @Test
    public void Sai_Taikhoan() {
        boolean result = log.login("wrongusername", "123");
        assertFalse(result, "dang nhap that bai do sai tai khoan");
    }

    @Test
    public void Sai_TK_MK() {
        boolean result = log.login("wrongusername", "wrongpassword");
        assertFalse(result, "Dang nhap that bai do sai tai khoan va mat khau");
    }
}
