public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("John Doe");
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Python Programming");
        Buku buku3 = new Buku("C++ Programming");
        Buku buku4 = new Buku("JavaScript Programming");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
