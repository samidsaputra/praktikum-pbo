package org.walimahasiswa;

public class Walimahasiswa {
    private String nama;
    private String alamat;
    private String nomorHp;
    private String nik;

    public Walimahasiswa(String nama, String nik ,String nomorHp, String alamat){
        this.nama = nama;
        this.nik = nik;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getNik(){
        return nik;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
