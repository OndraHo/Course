package fleet;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ondrej.hosek
 */
public class CarReader {

	public static ArrayList<Car> readCarList(String filename) {
		ArrayList<Car> carArrayList = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File(filename));
			while (scanner.hasNext()) {
				Brand brand = convertBrandToEnum(scanner.next());
				String model = scanner.next();
				String licencePlate = scanner.next();
				LocalDate nextCheckDate = LocalDate.parse(scanner.next());
				int mileage = scanner.nextInt();

				carArrayList.add(new Car(brand,model, licencePlate, nextCheckDate, mileage));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return carArrayList;
	}


	private static Brand convertBrandToEnum(String brand) {
		Brand brand1;
		switch (brand) {
			case "Škoda":
				brand1 = Brand.SKODA;
				break;
			case "Seat":
				brand1 = Brand.SEAT;
				break;
			case "Hyundai":
				brand1 = Brand.HYUNDAI;
				break;
			case "Opel":
				brand1 = Brand.OPEL;
				break;
			case "Renault":
				brand1 = Brand.RENAULT;
				break;
			default:
				brand1 = Brand.N_A;

		}
		return brand1;
	}
}