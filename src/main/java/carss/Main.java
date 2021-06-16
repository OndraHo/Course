package carss;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Racer> listOfRacers = new ArrayList<>();
		listOfRacers.add(new Racer("Eduard", LocalDate.of(2001,1,12), 10));
		listOfRacers.add(new Racer("Yveta", LocalDate.of(1999,9,18), 13));
// ... Přidej další závodníky, pokud chceš...
// Zjisti, kolik prvků spočítat.
// Pokud je závodníků méně nebo rovno 10, vezmeme všechny závodníky.
// Pokud je závodníků více než 10, budeme brát jen prvních 10.
// Použijeme funkci min javové třídy Math: ta vybere menší ze dvou parametrů:
		int numOfRacers = Math.min(listOfRacers.size(), 10);
// Pokud není v kolekci žádný závodník, nelze počítat průměr:
		if (numOfRacers > 0) {
			double sumOfDumplings = 0;
			for (int i = 0; i < numOfRacers; i++) {
				sumOfDumplings += listOfRacers.get(i).getNumberOfDumplings();
			}
			System.out.println("Average: "+(sumOfDumplings/numOfRacers));
		} else {
			System.out.println("No racers in the list!");
		}





		Product product = new Product(LocalDate.of(2021,3,8));

		System.out.println(product.canBeUsed());

		Race race2017 = new Race(2017, "skrabacov", LocalDate.now(), "Pepik");
		Race race2018 = new Race(2018, "KulickovyPohar", LocalDate.now(), "Mopsik");
		Race race2019 = new Race(2019, "devatenact", LocalDate.now(), "Karlik");

Racer pepa = new Racer("Pepa", 0, false);
Racer karlik = new Racer("Karlik", 0, false);
		Racer anonymous = new Racer();

		race2017.addRacer(pepa);
		race2017.addRacer(karlik);
		race2017.addRacer(anonymous);

		race2017.getRacerArrayList().get(2).getName();
		for (Racer racer : race2017.getRacerArrayList()){
			System.out.println(racer.getName());
		}

		int[] pole = {10,9,8,7};
		System.out.println(pole.length);
//		ArrayList<Race> races = new ArrayList<>();
//		races.add(race2017);
//		races.add(race2018);
//		races.add(race2019);
//
//		for (Race race : races) {
//			System.out.println(race.getTitle());
//		}


		User user = new User("Karel");
		User[] users = new User[10];
		users[1] = user;
		users[2] = user;
		users[1].setName("Pepa");
		System.out.println(users[1].getName());
		System.out.println(users[2].getName());
		System.out.println(user.getName());
	}
}