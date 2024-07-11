/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author asus
 */
public class maytinhthuong {
    private float a,b,c;

    public maytinhthuong() {
    }

    public maytinhthuong(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public String giaiPT() {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                return("Phương trình vô nghiệm!");
            } else {
                return("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            return("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            return("Phương trình vô nghiệm!");
        }
    }
}
