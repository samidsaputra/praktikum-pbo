package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama) {
        this.nama = nama;
        this.kecepatan = 0;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: Kendaraan");
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }

    public void gas(int kecepatan, int durasi) {
        this.kecepatan += kecepatan;
        System.out.println("Kecepatan ditambah sebesar " + kecepatan + " km/h selama " + durasi + " jam.");
    }

    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan berhenti.");
    }

    public void klakson() {
        System.out.println(nama + " berbunyi");
    }
}
