package org.bangundatar;

public class SegiEmpat {
    private double panjangSisi;
    
    public SegiEmpat(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        double hasil = panjangSisi * panjangSisi;
        return hasil;
    }
}
