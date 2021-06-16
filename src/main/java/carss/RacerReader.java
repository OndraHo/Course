package carss;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ondrej.hosek
 */
public class RacerReader {
	public static void main(String[] args) {
		readRacerList("C:\\IdeaProjects\\Course\\src\\zavodnici.txt");
	}

	public static ArrayList<Racer> readRacerList(String filename) {
		ArrayList<Racer> racerArrayList = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File(filename));
			while (scanner.hasNext()) {
				String name = scanner.next();
				LocalDate born = LocalDate.parse(scanner.next());
				int dumplings = scanner.nextInt();
				racerArrayList.add(new Racer(name, born, dumplings));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return racerArrayList;
	}
}