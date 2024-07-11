/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author asus
 */
public class giadien {
    private float sodien;

    public giadien() {
    }

    public giadien(float sodien) {
        this.sodien = sodien;
    }

    public float getSodien() {
        return sodien;
    }

    public void setSodien(float sodien) {
        this.sodien = sodien;
    }
    public float tiendien() {
        float tiendien=0;
        if(sodien <= 50) {
            tiendien = sodien*1806;
        }else if(sodien <=100 ) {
            tiendien = 50*1806 + (sodien-50)*1866;
        }else if(sodien <=200 ) {
            tiendien = 50*1806 + 50*1866 + (sodien-100)*2167;
        }else if(sodien <=300 ) {
            tiendien = 50*1806 + 50*1866 + 100*2167 + (sodien-200)*2729;
        }else if(sodien <=400 ) {
            tiendien = 50*1806 + 50*1866 + 100*2167 + 100*2729 + (sodien-300)*3050;
        }else if(sodien >400 ) {
            tiendien = 50*1806 + 50*1866 + 100*2167 + 100*2729 + 100*3050 + (sodien-400)*3151;
        }
        return tiendien;
    }
}
