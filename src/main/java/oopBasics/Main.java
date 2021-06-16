package oopBasics;


import java.time.Year;

/**
 * @author ondrej.hosek
 */

public class Main {

	private static String delimiter = "####################################";

	public static void main(String[] args) {

//		prepare data
		Teacher teacher = new Teacher("Novák", "Jan");

		SchoolClass clazz = new SchoolClass("C", 4, teacher);
		clazz.setFinalGrade("C", 4);

		Student peta = new Student("Svoboda", "Petr", Year.of(2011), 1);
		Student milda = new Student("Říha", "Milan", Year.of(2010), 123);
		Student jindra = new Student("Nový", "Jindřich", Year.of(2012), 345);

		clazz.setTeacher(teacher);
		clazz.addStudentToList(peta);
		clazz.addStudentToList(milda);
		clazz.addStudentToList(jindra);

// 1. ukol
		System.out.println(delimiter);
		System.out.println("Třída: " + clazz.getFinalGrade() + " (ročník: " + clazz.getGrade() + ")");
		System.out.println("Třídní učitel: " + teacher.getFullName());
		System.out.println("Počet studentů: " + clazz.getStudentList().size());
		System.out.print("\n");
		System.out.println(delimiter);
		System.out.println(peta.studentInfoWithYear(peta));
		System.out.println(milda.studentInfoWithYear(milda));
		System.out.println(jindra.studentInfoWithYear(jindra));
		System.out.print("\n");

// 2. ukol
		System.out.println(clazz.getFinalGrade() + ", " + clazz.getTeacher().getFirstName() + " " + clazz.getTeacher().getLastName());
		System.out.println(peta.studentInfoShort(peta));
		System.out.println(milda.studentInfoShort(milda));
		System.out.println(jindra.studentInfoShort(jindra));

// 3. ukol
		InputReader inputReader = new InputReader();
		OutputWriter outputWriter = new OutputWriter();
		SchoolClass myClass = inputReader.readClassInfo();

		myClass.setTeacher(inputReader.readTeacher());
		myClass.setStudentList(inputReader.readStudents());

		outputWriter.createFileWithData(myClass);

	}
}