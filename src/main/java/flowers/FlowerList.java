package flowers;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ondrej.hosek
 */
public class FlowerList {
	private ArrayList<Flower> data;

	public FlowerList(final ArrayList<Flower> flowers) {
		this.data = flowers;
	}

	public ArrayList<Flower> readFlowersFromFile(String fileLocation) {
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileLocation)))){
			while (scanner.hasNextLine()){
				String nextLine = scanner.nextLine();
				data.add(Flower.readText(nextLine));
			}
		}
		catch (FileNotFoundException e){
			System.err.println("Invalid path to file: " + fileLocation);

		}
	return null;
	}


}