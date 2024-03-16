package org.Truk;
import org.kendaraan.Kendaraan;
public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis: Truk");
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
        System.out.println("Berat Muatan: " + beratMuatan + " ton");
    }

    public void muatBarang(int berat) {
        if (beratMuatan + berat > kapasitasMuatan) {
            System.out.println("Kapasitas muatan terlampaui, barang tidak dapat dimuat.");
        } else {
            beratMuatan += berat;
            System.out.println("Barang dimuat seberat " + berat + " ton.");
        }
    }

    @Override
    public void klakson() {
        System.out.println(nama + " berbunyi, Honk Honk!");
    }
}
