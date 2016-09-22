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

	public Element datenEingeben(int artikelNr, int menge, double einzelpreis){
		Element neuesElement = new Element(artikelNr, menge, einzelpreis);
		return neuesElement;
	}

	public static void elementAnhaengen(Element listenAnfang, Element einzufuegendesElement){
		Element aktuellesElement = listenAnfang;
		while(aktuellesElement.getVerweis() != null){
			aktuellesElement = aktuellesElement.getVerweis();
		}
		aktuellesElement.setVerweis(einzufuegendesElement);
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
