package queue;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Patient {
	private String name;
	private LocalDate birthDate;
	private int id;
	public static int idCounter = 0;

	public Patient(final String name, final LocalDate birthDate) { //register next
		this.name = name;
		this.birthDate = birthDate;
		this.id = ++idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(final LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}
}