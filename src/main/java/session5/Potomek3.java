package session5;

/**
 * @author ondrej.hosek
 */

public class Potomek3 extends Predek{

		int b;
		public Potomek3(int b, int a) {
			super(a);
			this.b = b;
			// Atribut b se nastaví v konstruktoru:         b -> hodnota parametru
			// a zavolá se konstruktor třídy A přes super:  a -> hodnota parametru
		}
}