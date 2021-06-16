package oopBasics;

import java.time.Year;


/**
 * @author ondrej.hosek
 */

public class Student extends SchoolPerson {

	private int id;
	private String studentId;
	private static int STUDENT_COUNTER = 0;


	public Student(final String lastName, final String firstName, final String studentId) {
		super(lastName, firstName);
		this.studentId = studentId;
	}

	public Student(final String lastName, final String firstName, final Year year, final int id) {
		super(lastName, firstName, year);
		// ID should always have 3 chars
		if (testNumberOfDigits(id) == 3) {
			this.studentId = "ID" + id;
		}
		else if (testNumberOfDigits(id) == 2){
			this.studentId = "ID0" + id;
		}
		else if (testNumberOfDigits(id) == 1){
			this.studentId = "ID00" + id;
		}
	}

	private int testNumberOfDigits(final int id) {
		return (int) Math.log10(id) + 1;
	}

	@Override
	public String getFullName() {
		return (super.getFirstName() + " " + super.getLastName());
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(final String studentId) {
		this.studentId = studentId;
	}

	public String studentInfoWithYear(Student student){
		STUDENT_COUNTER++;
		return "# " + STUDENT_COUNTER + " # " + student.getStudentId() + " - " + student.getFullName() + " (" + student.getYear() + ")";
	}

	public String studentInfoShort(Student student){
		return student.getStudentId() + ", " + student.getFullName();
	}


}
