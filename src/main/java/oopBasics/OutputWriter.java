package oopBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ondrej.hosek
 */

public class OutputWriter implements IOutputWriter {
	private static final String FILE_NAME = "My_file.txt";

	@Override
	public void createFileWithData(SchoolClass schoolClass) {
		try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME)))) {
			writer.println("Trida: " + schoolClass.getClassName());
			writer.println("Ucitel se jmenuje: " + schoolClass.getTeacher().getFullName());
			for (Student student : schoolClass.getStudentList()) {
				writer.println(student.getFirstName() + " " + student.getLastName());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}