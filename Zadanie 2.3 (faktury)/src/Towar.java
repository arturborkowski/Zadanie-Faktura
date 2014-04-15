
public class Towar {

	private String nazwa;
	private String jednMiary;
	private double cenaJednNetto;
	private double cenaJednBrutto;
	private int iloscJednostek;
	private double cenaCalkowitaNetto;
	private double cenaCalkowitaBrutto;
	private double procentPodatku;
	
	
	/* Konstruktory */
	
	public Towar() {
		this.nazwa = null;
		this.jednMiary = null;
		this.iloscJednostek = 0;
		this.cenaJednNetto = 0;
		this.cenaJednBrutto = 0;
		this.cenaCalkowitaNetto = 0;
		this.cenaCalkowitaBrutto = 0;
		this.procentPodatku = 23;
		
	}
	
	public Towar(String nazwa, String jednMiary, double cenaBrutto, int ilosc, double podatek) {
		this.nazwa = nazwa;
		this.jednMiary = jednMiary;
		this.cenaJednBrutto = cenaBrutto;
		this.iloscJednostek = ilosc;
		this.procentPodatku = podatek/100;

		this.cenaJednNetto = this.cenaJednBrutto-(this.cenaJednBrutto*this.procentPodatku);
		this.cenaJednNetto *=100;
		this.cenaJednNetto = Math.round(this.cenaJednNetto);
		this.cenaJednNetto /= 100;
		
		this.cenaCalkowitaBrutto = this.cenaJednBrutto * this.iloscJednostek;
		this.cenaCalkowitaBrutto *=100;
		this.cenaCalkowitaBrutto = Math.round(this.cenaCalkowitaBrutto);
		this.cenaCalkowitaBrutto /= 100;
		
		this.cenaCalkowitaNetto = this.cenaJednNetto*this.iloscJednostek;
		
		
	}
	
	
	
	/* Gettery i settery */
	


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public String getNazwa() {
		return this.nazwa;
	}

	public void setJednMiary(String jednMiary) {
		this.jednMiary = jednMiary;
	}
	
	public String getJednMiary() {
		return this.jednMiary;
	}

	public double getCenaJednNetto() {
		return cenaJednNetto;
	}

	public void setCenaJednNetto(int cenaJednNetto) {
		this.cenaJednNetto = cenaJednNetto;
	}

	public double getCenaJednBrutto() {
		return cenaJednBrutto;
	}

	public void setCenaJednBrutto(int cenaJednBrutto) {
		this.cenaJednBrutto = cenaJednBrutto;
	}

	public int getIloscJednostek() {
		return iloscJednostek;
	}

	public void setIloscJednostek(int iloscJednostek) {
		this.iloscJednostek = iloscJednostek;
	}

	public double getCenaCalkowitaNetto() {
		return cenaCalkowitaNetto;
	}

	public void setCenaCalkowitaNetto(int cenaCalkowitaNetto) {
		this.cenaCalkowitaNetto = cenaCalkowitaNetto;
	}

	public double getCenaCalkowitaBrutto() {
		return cenaCalkowitaBrutto;
	}

	public void setCenaCalkowitaBrutto(int cenaCalkowitaBrutto) {
		this.cenaCalkowitaBrutto = cenaCalkowitaBrutto;
	}

	public double getProcentPodatku() {
		return procentPodatku;
	}

	public void setProcentPodatku(byte procentPodatku) {
		this.procentPodatku = procentPodatku;
	}
	
	
	/* Metody */
	
	
	public String toString() {
		return nazwa+", iloœæ: "+iloscJednostek+" "+jednMiary+" . Cena brutto za "+jednMiary+" = "+cenaJednBrutto+
				", Cena netto za "+jednMiary+" = "+cenaJednNetto+", Ca³kowita cena brutto to "+cenaCalkowitaBrutto+
				" PLN, a ca³kowita cena netto to "+cenaCalkowitaNetto+" PLN. Stawka podatkowa wynosi "+(int)(procentPodatku*100)+"%";
	}
	
	
}
