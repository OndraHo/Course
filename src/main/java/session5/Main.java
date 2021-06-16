package session5;

/**
 * @author ondrej.hosek
 */

public class Main {

	public static void main(String[] args) {

		Potomek3 potomek3 = new Potomek3(4, 1);
		System.out.println(" potomek3.a " +  potomek3.a + "   potomek3.b:" +   potomek3.b);
//		nelze protoze Van je obsahlejsi nez Car
//		Van van = new Car();
//		van.getInt();

		// Vytvoříme proměnnou pro uložení instancí třídy Car:
		Car a;
		// Uložíme do proměnné a novou instanci třídy Car.
		a = new Car();

		// Protože v proměnné a je instance třídy Car,
		//  použije se metoda getInt() z Car => vrací 1;
		printContentOfA(a); // => 1
		// Nyní uložme do proměnné a instanci třídy Van. To lze, protože Van je
		//  potomek třídy Car.
		a = new Van();

		// Protože v proměnné a je nyní instance třídy B,
		//  použije se metoda getInt() z B => vrací 2.
		// Přitom datový typ proměnné a je pořád stejný!
		printContentOfA(a); // => 2

	}

	public static void printContentOfA(Car a) {
		// Zde nelze rozhodnout, zda se má použít getInt z předka či z potomka.
		// Obě varianty jsou možné podle toho, co bude skutečným obsahem
		//  parametru a.
		System.out.println(a.getInt());
	}
}