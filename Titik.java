class Titik
{
	double absis;
	double ordinat;
	static double counterTitik;

	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double abs, double ord)
	{
		absis = abs;
		ordinat = ord;
		counterTitik++;
	}
	
	void setAbsis(double abs)
	{
		absis = abs;
	}
	
	double getAbsis()
	{
		return absis;
	}
	void setOrdinat(double ord)
	{
		ordinat = ord;
	}
	double getOrdinat()
	{
		return ordinat;
	}
	static double getCounterTitik()
	{
		return counterTitik;
	}
	
}