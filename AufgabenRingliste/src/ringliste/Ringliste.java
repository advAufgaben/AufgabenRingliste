package ringliste;

public class Ringliste {
	private Ringliste verweis;
	private int inhalt;

	public Ringliste(){
		super();
	}

	public Ringliste(int inhalt){
		super();
		this.setInhalt(inhalt);
	}

	public int zaehlen(){
		int start = this.getInhalt();
		int zaehler = 1;

		Ringliste aktuellesElement = verweis;
		while(aktuellesElement.getInhalt() != start){
			aktuellesElement = aktuellesElement.getVerweis();
			zaehler++;
		}

		return zaehler;
	}

	public static void loeschen(Ringliste einstieg, int zahl){
		Ringliste nachfolger = einstieg.getVerweis();
		Ringliste aktuellesElement = einstieg;

		int zaehler = 0;
		int limit = einstieg.zaehlen();
		while(nachfolger.getInhalt() != zahl){
			aktuellesElement = nachfolger;
			nachfolger = aktuellesElement.getVerweis();

			//abbrechen falls Element nicht vorhanden
			zaehler++;
			if(zaehler > limit){
				return;
			}
		}
		aktuellesElement.setVerweis(nachfolger.getVerweis());
	}

	public static void einfuegen(Ringliste einstieg, int einzufuegendesElement, int einfuegenNach){
		Ringliste aktuellesElement = einstieg;

		while(aktuellesElement.getInhalt() != einfuegenNach){
			aktuellesElement = aktuellesElement.getVerweis();
		}

		Ringliste neuesElement = new Ringliste(einzufuegendesElement);
		neuesElement.setVerweis(aktuellesElement.getVerweis());
		aktuellesElement.setVerweis(neuesElement);
	}

	public String ausgeben(){
		String result = "" + this.getInhalt();
		Ringliste element = this.getVerweis();
		for(; element != this; element = element.getVerweis()){
			result += "," + element.getInhalt();
		}
		return result;
	}

	public Ringliste getVerweis() {
		return verweis;
	}

	public void setVerweis(Ringliste verweis) {
		this.verweis = verweis;
	}

	public int getInhalt() {
		return inhalt;
	}

	public void setInhalt(int inhalt) {
		this.inhalt = inhalt;
	}
}
