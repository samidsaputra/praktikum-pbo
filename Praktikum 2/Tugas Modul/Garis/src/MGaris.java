public class MGaris {
    public static void main(String[] args) {
        Titik titik1 = new Titik(0, 0);
        Titik titik2 = new Titik(3, 4);
        Garis garis1 = new Garis(titik1, titik2);

        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());

        Titik titik3 = new Titik(1, 1);
        Titik titik4 = new Titik(5, 5);
        Garis garis2 = new Garis(titik3, titik4);

        System.out.println("Apakah garis1 tegak lurus dengan garis2? " + garis1.isTegakLurus(garis2));

        Garis garisRefleksi = garis1.getRefleksiY();
        System.out.println("Garis hasil pencerminan terhadap sumbu Y:");
        System.out.println("Titik Awal: (" + garisRefleksi.titikAwal.x + ", " + garisRefleksi.titikAwal.y + ")");
        System.out.println("Titik Akhir: (" + garisRefleksi.titikAkhir.x + ", " + garisRefleksi.titikAkhir.y + ")");
    }
}