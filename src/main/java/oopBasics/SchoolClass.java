package oopBasics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ondrej.hosek
 */

public class SchoolClass {

	private String className;
	private int grade;
	private Teacher teacher;
	private List<Student> studentList = new ArrayList<>();
	private String finalGrade;

	public void setStudentList(final List<Student> studentList) {
		this.studentList = studentList;
	}

	public SchoolClass() {
	}

	public SchoolClass(final String className, final int grade, final Teacher teacher) {
		this.className = className;
		this.grade = grade;
		this.teacher = teacher;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(final String className) {
		this.className = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(final Teacher teacher) {
		this.teacher = teacher;
	}

	public void addStudentToList(Student student) {
		if (student != null) {
			studentList.add(student);
		} else throw new NullPointerException("student is null");
	}

	public int getGrade() {
		return grade;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setGrade(final int grade) {
		this.grade = grade;
	}

	public String getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(String className, int grade) {
		this.finalGrade = grade + "." + className;
	}
}
