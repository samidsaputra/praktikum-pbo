package org.bangundatar;

public class Segitiga {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luasSegitiga(){
        return 0.5 * tinggi * alas;
    }
}
