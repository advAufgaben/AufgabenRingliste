package ringliste;

public class Test {

	public static void main(String[] args) {
		Ringliste element1 = new Ringliste();
		element1.setInhalt(1);
		Ringliste element2 = new Ringliste();
		element2.setInhalt(2);
		Ringliste element3 = new Ringliste();
		element3.setInhalt(3);
		Ringliste element4 = new Ringliste();
		element4.setInhalt(4);
		Ringliste element5 = new Ringliste();
		element5.setInhalt(5);

		element1.setVerweis(element2);
		element2.setVerweis(element3);
		element3.setVerweis(element4);
		element4.setVerweis(element5);
		element5.setVerweis(element1);

		System.out.println("" + element1.zaehlen());

		Ringliste einstieg = element2;

		System.out.println(einstieg.ausgeben());

		Ringliste.einfuegen(einstieg, 6, 5);

		System.out.println(einstieg.ausgeben());
	}

}
