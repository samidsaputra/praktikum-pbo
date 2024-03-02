public class Titik
{
	private double absis;
	private double ordinat;
	private static double counterTitik;


	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double abs, double ord)
	{
		this.absis = abs;
		this.ordinat = ord;
		counterTitik++;
	}
	
	public void setAbsis(double absis)
	{
		this.absis = absis;
	}
	public double getAbsis()
	{
		return this.absis;
	}
	public void setOrdinat(double ordinat)
	{
		this.ordinat = ordinat;
	}
	public double getOrdinat()
	{
		return this.ordinat;
	}
	public static double getCounterTitik()
	{
		return counterTitik;
	}
	public double getJarakPusat()
	{
		return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
	}

	public void refleksiX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat *= -1;
		titik.setOrdinat(ordinat);
	}
	public void refleksiY(Titik titik){
		double absis = titik.getAbsis();
		absis *= -1;
		titik.setAbsis(absis);
	}
	public void getRefleksiX(Titik t){
		refleksiX(t);
	}
	public void getRefleksiY(Titik t){
		refleksiX(t);
	}

}