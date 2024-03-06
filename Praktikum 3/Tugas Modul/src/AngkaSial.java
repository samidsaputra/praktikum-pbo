public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13 ){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka");
        }
    }
}
/*
 *1Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 *2Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 1 ketika eksepsi terjadi line 12 tidak akan berjalan namun masuk ke kondisi Exception
 2 dieksekusi ketika as.cobaAngka(13)
 */