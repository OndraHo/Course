package oopBasics;

/**
 * @author ondrej.hosek
 */

public class Teacher extends SchoolPerson {

	public Teacher() {
		super();
	}

	public Teacher(final String lastName, final String firstName) {
		super(lastName, firstName);
	}

	@Override
	public String getFullName() {
		return (super.getLastName() + " " + super.getFirstName());
	}
}