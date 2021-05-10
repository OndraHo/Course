package biathlon;

/**
 * @author ondrej.hosek
 */
public class Main {
	public static void main(String[] args) {
		int shotsCount = 5;
		String[] competitors = {"Gabina", "Marketa"};
		double probability = 0.7;

		for (String competitor : competitors) {
			int penaltyLapCount = 0;
			for (int j = 0; j < shotsCount; j++) {
				System.out.println(competitor + " Strili");
				if (Math.random() < probability) {
					System.out.println(competitor + " se trefuje");
				} else {
					System.out.println(competitor + " Bohuzel mimo");
					penaltyLapCount++;
				}
			}
			System.out.println(competitor + " musela objet " + penaltyLapCount + " trestnych kol");
		}
	}
}