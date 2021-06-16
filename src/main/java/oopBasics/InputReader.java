package oopBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author ondrej.hosek
 */

public class InputReader implements IInputReader {

	private static final Logger logger = Logger.getLogger(InputReader.class);
	private static final String DELIMITER = ", ";

	@Override
	public Teacher readTeacher() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter following values separated by comma: teacher`s first name, teacher`s last name: ");
		String inputFromKeyboard = keyboard.nextLine().trim();
		if (inputFromKeyboard.isBlank()) {
			return null;
		}
		try {
			if (!inputFromKeyboard.isBlank()) {
				return prepareTeacher(inputFromKeyboard);
			}
		} catch (Exception e) {
			logger.error("No value " + e);
		}
		return null;
	}

	@Override
	public SchoolClass readClassInfo() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter following values separated by comma: class name, grade ");
		String inputFromKeyboard = keyboard.nextLine().trim();
		if (inputFromKeyboard.isBlank()) {
			return null;
		}
		try {
			{
				return prepareClassroom(inputFromKeyboard);
			}
		} catch (Exception e) {
			logger.error("No value " + e);
		}
		return null;
	}


	@Override
	public List<Student> readStudents() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter following values separated by comma: student`s first name, student`s last name, student`s ID ");

		List<Student> students = new ArrayList<>();
		while (keyboard.hasNextLine()) {
			String inputFromKeyboard = keyboard.nextLine().trim();
			if (inputFromKeyboard.isBlank()) {
				logger.error("You do not enter any value");
				return students;
			}
			try {
				String[] values = inputFromKeyboard.split(DELIMITER);
				students.add(new Student(values[1], values[0], values[2]));
			} catch (Exception e) {
			}
		}
		return students;
	}

	@Override
	public Teacher prepareTeacher(final String inputFromKeyboard) {
		String[] values = inputFromKeyboard.split(DELIMITER);
		Teacher t = new Teacher();
		if (values.length > 0) {
			t.setFirstName(values[1]);
			t.setLastName(values[0]);
			return t;
		} else {
			return null;
		}
	}

	@Override
	public SchoolClass prepareClassroom(final String inputFromKeyboard) {
		String[] values = inputFromKeyboard.split(DELIMITER);
		SchoolClass c = new SchoolClass();

		if (values.length > 0) {
			c.setClassName(values[0]);
			c.setGrade(Integer.parseInt(values[1]));
			return c;
		} else {
			return null;
		}
	}
}