package oopBasics;

import java.util.List;

/**
 * @author ondrej.hosek
 */

public interface IInputReader {

	Teacher readTeacher();

	SchoolClass readClassInfo();

	List<Student> readStudents();

	Teacher prepareTeacher(String inputFromKeyboard);

	SchoolClass prepareClassroom(String inputFromKeyboard);
}
