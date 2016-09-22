package datenstruktur;

public class Element {
	private int artikelNr;
	private int menge;
	private double einzelpreis;
	private Element verweis;
	private String name;

	public Element(){
		super();
	}

	public Element(int artikelNr, int menge, double einzelpreis, Element verweis, String name) {
		super();
		this.artikelNr = artikelNr;
		this.menge = menge;
		this.einzelpreis = einzelpreis;
		this.verweis = verweis;
		this.name = name;
	}

	public Element(int artikelNr, int menge, double einzelpreis) {
		super();
		this.artikelNr = artikelNr;
		this.menge = menge;
		this.einzelpreis = einzelpreis;
	}

	/**
	 * Aufgabe 2.1
	 * erzeugt neues Element mit den übergebenen Parametern
	 * @param artikelNr
	 * @param menge
	 * @param einzelpreis
	 * @return
	 */
	public static Element datenEingeben(int artikelNr, int menge, double einzelpreis){
		Element neuesElement = new Element(artikelNr, menge, einzelpreis);
		return neuesElement;
	}

	/**
	 * Aufgabe 2.2
	 * hängt Element am Ende der Liste an
	 * @param listenAnfang
	 * @param einzufuegendesElement
	 */
	public static void elementAnhaengen(Element listenAnfang, Element einzufuegendesElement){
		Element aktuellesElement = listenAnfang;
		while(aktuellesElement.getVerweis() != null){
			aktuellesElement = aktuellesElement.getVerweis();
		}
		aktuellesElement.setVerweis(einzufuegendesElement);
	}
	
	/**
	 * Aufgabe 2.3
	 * erzeugt eine einfach verkettete Liste mit {@code anzahl} Elementen
	 * @param anzahl
	 * @return
	 */
	public static Element listeErzeugen(int anzahl){
		Element listenAnfang = datenEingeben(0, (int)(Math.random() * 10), Math.random() * 5);
		
		for(int i = 1; i < anzahl; i++){
			Element element = datenEingeben(i, (int)(Math.random() * 10), Math.random() * 5);
			elementAnhaengen(listenAnfang, element);
		}
		
		return listenAnfang;
	}
	
	/**
	 * Aufgabe 2.4
	 * Gibt Element aus
	 */
	public void ausgeben(){
		String result = "--------------\r\n" // \r\n = Zeilenumbruch
				+ "Name: " + this.getName() + "\r\n"
				+ "Artikelnummer: " + this.getArtikelNr() + "\r\n"
				+ "Menge: " + this.getMenge() + "\r\n"
				+ "Einzelpreis: " + this.getEinzelpreis() + "\r\n";
		System.out.println(result);
	}
	
	/**
	 * Aufgabe 2.5
	 * gibt alle Elemente aus
	 */
	public void alleAusgeben(){
		for(Element element = this; element != null; element = element.getVerweis()){
			element.ausgeben();
		}
	}
	
	/**
	 * Ausgabe 2.6
	 * sucht nach artikelnr und gibt gesuchtes Element zurück.
	 * @param id vmtl. Artikelnr
	 * @return Element mit artikelnr == id. Falls nicht gefunden null
	 */
	public Element sucheID(int id){
		for(Element element = this; element != null; element = element.getVerweis()){
			if(element.getArtikelNr() == id){
				return element;
			}
		}
		return null;
	}
	
	/**
	 * Ausgabe 2.7
	 * sucht nach name und gibt gesuchtes Element zurück.
	 * @param id vmtl. Artikelnr
	 * @return Element mit gesuchtem namen. Falls nicht gefunden null
	 */
	public Element sucheName(String name){
		for(Element element = this; element != null; element = element.getVerweis()){
			if(element.getName() != null && element.getName().equals(name)){
				return element;
			}
		}
		return null;
	}
	
	public int getArtikelNr() {
		return artikelNr;
	}

	public void setArtikelNr(int artikelNr) {
		this.artikelNr = artikelNr;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getEinzelpreis() {
		return einzelpreis;
	}

	public void setEinzelpreis(double einzelpreis) {
		this.einzelpreis = einzelpreis;
	}

	public Element getVerweis() {
		return verweis;
	}

	public void setVerweis(Element verweis) {
		this.verweis = verweis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
