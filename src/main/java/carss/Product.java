package carss;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Product {
	private LocalDate produced;
	private LocalDate maxUsage;

	public Product(final LocalDate produced) {
		this.produced = produced;
	}

	public String canBeUsed() {
		final LocalDate maxUsage = produced.plusMonths(2);
		String result = null;
		if (maxUsage.isBefore(LocalDate.now())) {
			result = "Expired";

		} else if (maxUsage.isEqual(LocalDate.now())) {
			result = "Should be used today";
		} else if (maxUsage.isAfter(LocalDate.now())) {
			result = "It`s OK. Product can be used till " + maxUsage;
		}
		return result;
	}

}
