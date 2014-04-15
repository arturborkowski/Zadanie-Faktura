
public class FakturaTester {

	public static void main(String args[]) {
		
		Towar jablko = new Towar("Jab³ko", "kg", 4.50, 10, 23);
		Towar gruszka = new Towar("Gruszka", "kg", 5.20, 6, 23);
		Towar tabletki = new Towar("Rutinoscorbin", "szt.", 0.95, 50, 7);
		Towar samochody = new Towar("Audi A8", "szt.", 150000, 2, 23);
		

		Faktura nowa = new Faktura("10 kwietnia 2014 r.", 25, "4 maja 2014");
		nowa.dodajDoListy(jablko);
		nowa.dodajDoListy(gruszka);
		nowa.dodajDoListy(tabletki);
		nowa.dodajDoListy(samochody);
		nowa.wypiszTowary();
		nowa.showInfo();
		
		
		
	}
	
}
