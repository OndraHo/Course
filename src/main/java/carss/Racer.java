package carss;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Racer {
	String name;
	int numberOfDumplings;
	boolean isResultFinal;
	LocalDate born;

	public Racer(){
		this("Mysterio", 0, false);
	}
	public Racer(final String name, final int numberOfDumplings) {
		this(name, numberOfDumplings, false);
	}

	public Racer(final String name) {
		this.name = name;
	}

	public Racer(final String name, final int numberOfDumplings, final boolean isResultFinal) {
		this.name = name;
		this.numberOfDumplings = numberOfDumplings;
		this.isResultFinal = isResultFinal;
	}

	public Racer(final String name, final LocalDate born, final int dumplings) {
		this.name=name;
		this.born=born;
		this.numberOfDumplings=dumplings;

	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getNumberOfDumplings() {
		return numberOfDumplings;
	}

	public void setNumberOfDumplings(final int numberOfDumplings) {
		this.numberOfDumplings = numberOfDumplings;
	}

	public boolean isResultFinal() {
		return isResultFinal;
	}

	public void setResultFinal(final boolean resultFinal) {
		isResultFinal = resultFinal;
	}

	public int addDumplings(int howMuch){
		return this.numberOfDumplings = numberOfDumplings + howMuch;

	}

	public void toSimpleText(String racerName, int numberOfDumplings, int points){

		System.out.println();

	}
}