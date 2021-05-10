package fleet;

import java.time.LocalDate;
import java.util.ArrayList;

import static fleet.CarReader.readCarList;

/**
 * @author ondrej.hosek
 */
public class Main {
	public static final int LAST_CHECK_MONTHS = 11;

	public static void main(String[] args) {

		Car myCar = new Car(Brand.SEAT, "Leon", "1BX 6879", LocalDate.of(2021, 10, 10), 10);

		ArrayList<Car> carArrayList = readCarList("C:\\IdeaProjects\\Course\\src\\fleet\\cars.csv");

		for (Car car : carArrayList) {
			if (lastCheckBeforeElevenMonths(car)) {
				System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getLicencePlate());
			}
		}

		ArrayList<Car> engetoFleet = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			engetoFleet.add(new Car(Brand.HYUNDAI, "i40", licencePlateGenerator(i), LocalDate.now(), 40));
			System.out.println(engetoFleet.get(i).getLicencePlate());
		}
	}

	private static boolean lastCheckBeforeElevenMonths(final Car car) {
		return car.getLastCheckDate().isBefore(LocalDate.now().minusMonths(LAST_CHECK_MONTHS));
	}


	private static String licencePlateGenerator(int i) {
		if (i == 0) return "ENGETO0" + ++i;
		if (i < 10) return "ENGETO0" + ++i;
		else return "ENGETO" + ++i;
	}

}