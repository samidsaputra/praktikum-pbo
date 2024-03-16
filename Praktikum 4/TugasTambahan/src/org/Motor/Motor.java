package org.Motor;
import org.kendaraan.Kendaraan;
public class Motor extends Kendaraan {
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: Motor");
        System.out.println("Kapasitas Mesin CC: " + cc);
    }

    public double hitungHorsepower(int angka) {
        return cc * (angka / 15.0);
    }

    @Override
    public void klakson() {
        System.out.println(nama + " berbunyi, Womp Womp!");
    }
}
