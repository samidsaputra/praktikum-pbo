package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());

        Segitiga l = new Segitiga(10,10);
        persegi.printInfo();
        System.out.println("Luas Segitiga : "+l.luasSegitiga());
    }
}
