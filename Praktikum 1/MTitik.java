/**
 * File      		: MTitik.java		21/02/24
 * Nama penulis   	: M. Dimas Saputra
 * NIM               	: 24060122140159
 * Deskripsi 		: Kelas yang berisi realisasi dari Titik.java
 * 
 */
class MTitik
{
	public static void main(String[] args)
	{
		Titik t1, t2;

		t1 = new Titik();
		t2 = new Titik();
		Titik t3;
		t3 = new Titik(5,6);
		
		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2.setAbsis(3);
		t2.setOrdinat(4);

		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());		
		System.out.println("t1(" + t1.getAbsis() +"," + t1.getOrdinat() +")");
		System.out.println("t2(" + t2.getAbsis() +"," + t2.getOrdinat() +")");
		System.out.println("t3(" + t3.getAbsis() +"," + t3.getOrdinat() +")");
	}
}
