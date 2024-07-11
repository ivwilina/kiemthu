/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.lang.Math;
/**
 *
 * @author asus
 */
public class dautu {
    private float tong, laisuat, thoigian;
    private String hinhthuc;

    public dautu() {
    }

    public dautu(float tong, float laisuat, float thoigian, String hinhthuc) {
        this.tong = tong;
        this.laisuat = laisuat;
        this.thoigian = thoigian;
        this.hinhthuc = hinhthuc;
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }

    public float getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(float laisuat) {
        this.laisuat = laisuat;
    }

    public float getThoigian() {
        return thoigian;
    }

    public void setThoigian(float thoigian) {
        this.thoigian = thoigian;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }
    
    public float tinhlai() {
        float lai=0;
        if(hinhthuc.equals("Lãi đơn")) {
            float tongtien = tong * (1+ thoigian*(laisuat/100));
            lai = tongtien - tong;
        }else if(hinhthuc.equals("Lãi kép")) {
            Double temp1 = Math.pow((1+(laisuat/100)),thoigian);
            lai = tong*temp1.floatValue()-tong;
        }
        return lai;
    }
    
    public float tinhtong() {
        float tongtien=0;
        if(hinhthuc.equals("Lãi đơn")) {
            tongtien = tong * (1+ thoigian*(laisuat/100));
        }else if(hinhthuc.equals("Lãi kép")) {
            Double temp1 = Math.pow((1+(laisuat/100)),thoigian);
            tongtien = tong*temp1.floatValue();
        }
        return tongtien;
    }
}
