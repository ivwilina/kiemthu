/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author asus
 */
public class bmi {
    private float chieucao, cannang;

    public bmi() {
    }

    public bmi(float chieucao, float cannang) {
        this.chieucao = chieucao;
        this.cannang = cannang;
    }

    public float getChieucao() {
        return chieucao;
    }

    public void setChieucao(float chieucao) {
        this.chieucao = chieucao;
    }

    public float getCannang() {
        return cannang;
    }

    public void setCannang(float cannang) {
        this.cannang = cannang;
    }
    public float tinhBMI() {
        return cannang/(chieucao*chieucao);
    }
    public String danhgia() {
        float bmi = cannang/(chieucao*chieucao);
        if (bmi < 18)
            return "Gầy";
        else if (bmi < 25.0)
            return "Bình Thường";
        else if (bmi < 30.0)
            return "Thừa Cân";
        else
            return "Béo Phì";
    }
}
