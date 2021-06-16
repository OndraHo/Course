package oopBasics;


import java.time.Year;

/**
 * @author ondrej.hosek
 */

public abstract class SchoolPerson {

	private String lastName;
	private String firstName;
	private String fullName;
	private Year year;


	public SchoolPerson(){
	}

	public SchoolPerson(final String lastName, final String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public SchoolPerson(final String lastName, final String firstName, final Year year) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.year = year;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(final Year year) {
		this.year = year;
	}
}