package org.mahasiswa;
import org.walimahasiswa.Walimahasiswa;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private String nik;
    private String nim;
    private Walimahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, Walimahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getNik(){
        return nik;
    }
    public Walimahasiswa getWali(){
        return wali;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(Walimahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        System.out.println("Nama\t: " + getNama());
        System.out.println("Nik\t\t: " + getNik());
        System.out.println("Nim\t\t: " + getNim());
        System.out.println("Jurusan\t: " + getJurusan());
        System.out.println("Wali\t: " + getWali().getNama()+"\n");
    }

}
