package carss;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author ondrej.hosek
 */
public class Race {
	int racersYearOfBirth;
	String title;
	LocalDate date;
	String winner;
	LocalDate born;
	Integer year;
	ArrayList<Racer> racerArrayList = new ArrayList<>();

	public Race(int year) {
		this(year, "Svestka cup", LocalDate.now(), null);
	}

	public Race(int year, String title, LocalDate date, String winner) {
		this.year = year;
		this.title = title;
		this.date = date;
		this.winner = winner;
		this.racerArrayList = new ArrayList<>();
	}




	public void addRacer(Racer racer) {
		racerArrayList.add(racer);
	}

	public void removeRacer(Racer racer) {
	racerArrayList.remove(racer);
	}

	public ArrayList<Racer> getRacerArrayList() {
		return racerArrayList;
	}

//	public void setRacerArrayList(final ArrayList<Racer> racerArrayList) {
//		this.racerArrayList = racerArrayList;
//	}

	public int getRacersYearOfBirth() {
		return racersYearOfBirth;
	}

	public void setRacersYearOfBirth(final int racersYearOfBirth) {
		this.racersYearOfBirth = racersYearOfBirth;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(final Integer year) {
		this.year = year;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(final String winner) {
		this.winner = winner;
	}

	public LocalDate getBorn() {
		return born;
	}

	public void setBorn(final LocalDate born) {
		this.born = born;
	}
}