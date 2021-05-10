package fleet;

/**
 * @author ondrej.hosek
 */
public enum Brand {
	SEAT("Seat"),
	HYUNDAI("Hyundai"),
	SKODA("Škoda"),
	OPEL("Opel"),
	RENAULT("Renault"),
	N_A("not known");

	private final String brand;

	Brand(String brand) {
		this.brand = brand;
	}


}
