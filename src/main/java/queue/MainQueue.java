package queue;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class MainQueue {
	public static void main(String[] args) {

		Patient first = new Patient("pape", LocalDate.of(2020, 10, 10));
		Patient second = new Patient("Anez", LocalDate.of(2020, 10, 10));

		System.out.println(first.getId());
		System.out.println(second.getId());
	}
}