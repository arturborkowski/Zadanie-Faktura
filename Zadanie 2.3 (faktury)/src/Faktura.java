import java.util.ArrayList;

public class Faktura {

	private String dataSprzedazy;
	private int dniDoZaplaty;
	private String terminZaplaty;
	private double cenaCalkowitaNetto = 0;
	private double cenaCalkowitaBrutto = 0;
	ArrayList<Towar> listaTowarow = new ArrayList<Towar>();
	
	/* Konstruktory */
	
	public Faktura() {
		this.dataSprzedazy = "Nie podano";
		this.dniDoZaplaty = 0;
		this.terminZaplaty = "Nie podano";
		this.cenaCalkowitaNetto = 0;
		this.cenaCalkowitaBrutto = 0;
		this.listaTowarow = null;
	}
	
	public Faktura(String dataSprzedazy, int dniDoZaplaty, String terminZaplaty) {
		this.dataSprzedazy = dataSprzedazy;
		this.dniDoZaplaty = dniDoZaplaty;
		this.terminZaplaty = terminZaplaty;
	}
	
	/* Gettery i settery */
	
	public String getDataSprzedazy() {
		return dataSprzedazy;
	}
	public void setDataSprzedazy(String dataSprzedazy) {
		this.dataSprzedazy = dataSprzedazy;
	}
	public int getDniDoZaplaty() {
		return dniDoZaplaty;
	}
	public void setDniDoZaplaty(int dniDoZaplaty) {
		this.dniDoZaplaty = dniDoZaplaty;
	}
	public String getTerminZaplaty() {
		return terminZaplaty;
	}
	public void setTerminZaplaty(String terminZaplaty) {
		this.terminZaplaty = terminZaplaty;
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
	
	
	/* METODY */
	
	public void dodajDoListy(Towar t) {
		this.listaTowarow.add(t);
		this.cenaCalkowitaNetto+=t.getCenaCalkowitaNetto();
		this.cenaCalkowitaBrutto+=t.getCenaCalkowitaBrutto();
	}
	
	void showInfo() {
		System.out.println("Faktura z dnia "+dataSprzedazy+". Termin zap³aty - "+terminZaplaty+
				". Iloœæ dni pozosta³ych do zap³aty to: "+dniDoZaplaty);
	}
	
	public void wypiszTowary() {
		for(Towar x: listaTowarow) {
			System.out.println(x.toString());
		}
		
		System.out.println();
		System.out.println("Cena ca³kowita netto wszystkich towarów to: "+this.cenaCalkowitaNetto+" PLN");
		System.out.println("Cena ca³kowita brutto wszystkich towarów to: "+this.cenaCalkowitaBrutto+" PLN");
		
	}
	
	
}
