package org.bangunruang;
import org.bangundatar.SegiEmpat;

public class LimasSegiEmpat{
    private double tinggi;
    private SegiEmpat alas;

    public LimasSegiEmpat(double tinggi, SegiEmpat alas){
        this.tinggi = tinggi;
        this.alas  = alas;
    }

    public double hitungVolume(){
        return (1.0/3)*alas.hitungLuas()*tinggi;
    }

    public double hitungLuasPermukaan(){
        return alas.hitungLuas()+(3 * alas.hitungLuas());
    }
}