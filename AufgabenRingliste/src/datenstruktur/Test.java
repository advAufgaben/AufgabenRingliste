package datenstruktur;


public class Test {
	public static void main(String[] args) {
		Element liste = Element.listeErzeugen(5);
		liste.alleAusgeben();
		
		Element sucheArtikel2 = liste.sucheID(2);
		sucheArtikel2.ausgeben();
	}
}
