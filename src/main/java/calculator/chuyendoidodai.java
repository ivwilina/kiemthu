/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author asus
 */
public class chuyendoidodai {
    private float goc, chuyendoi;
    private String dvi;

    public chuyendoidodai() {
    }

    public chuyendoidodai(float goc, float chuyendoi, String dvi) {
        this.goc = goc;
        this.chuyendoi = chuyendoi;
        this.dvi = dvi;
    }

    public float getGoc() {
        return goc;
    }

    public void setGoc(float goc) {
        this.goc = goc;
    }

    public float getChuyendoi() {
        return chuyendoi;
    }

    public void setChuyendoi(float chuyendoi) {
        this.chuyendoi = chuyendoi;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }
    public float doidvi() {
        float dvi2;
        switch (dvi) {
            case "Hải lý":
                dvi2 = goc/1852;
                break;
            case "Dặm":
                dvi2 = (float) (goc/1609.344);
                break;
            case "Thước anh":
                dvi2 = (float) (goc/0.9144);
                break;
            case "Foot":
                dvi2 = (float) (goc/0.3048);
                break;
            case "Inch":
                dvi2 = (float) (goc/0.0254);
                break;
            default:
                throw new AssertionError();
        }
        return dvi2;
    }
}
