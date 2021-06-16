package session5.cisla;

/**
 * @author ondrej.hosek
 */

public class CeleCislo extends Cislo{


	@Override
	public int getValue() {
		System.out.println("vypisu hodnotu CeleCislo");
		return 8;
	}

	public void jakeCislo(){
		System.out.println("Toto je celeCislo");
	}
}