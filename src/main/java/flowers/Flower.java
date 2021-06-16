package flowers;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Flower {
	private String name;
	private LocalDate lastWatering;
	private LocalDate planted;
	private int frequencyOfWateringInDays;
	private String note;

	private static final String EMPTY_STRING = "";
	private static final int DEFAULT_WATERING_FREQUENCY = 7;
	private LocalDate nextWatering;
	private static String DELIMITER = "\t";

	public Flower(final String name, final LocalDate lastWatering, final LocalDate planted, final int frequencyOfWatering) {
		this.name = name;
		this.lastWatering = lastWatering;
		this.planted = planted;
		this.frequencyOfWateringInDays = frequencyOfWatering;
	}

	public Flower() {
		this.note = EMPTY_STRING;
		this.lastWatering = LocalDate.now();
	}

	public Flower(String name) {
		this();
		this.name = name;
		this.frequencyOfWateringInDays = DEFAULT_WATERING_FREQUENCY;
		this.planted = LocalDate.now();
	}

	public Flower(final String name, final String notes, final int frequencyOfWatering, final LocalDate planted, final LocalDate lastWatering) {

	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public LocalDate getLastWatering() {
		return lastWatering;
	}

	public void setLastWatering(final LocalDate lastWatering) throws FlowersException {
		if (lastWatering.isBefore(planted)) {
			throw new FlowersException("string");
		} else {
			this.lastWatering = lastWatering;
		}
	}

	public LocalDate getPlanted() {
		return planted;
	}

	public void setPlanted(final LocalDate planted) {
		this.planted = planted;
	}

	public int getFrequencyOfWateringInDays() {
		return frequencyOfWateringInDays;
	}

	public void setFrequencyOfWateringInDays(final int frequencyOfWateringInDays) throws FlowersException {
		if (frequencyOfWateringInDays <= 0) {
			throw new FlowersException("string");
		} else {
			this.frequencyOfWateringInDays = frequencyOfWateringInDays;
		}
	}

	public String getNote() {
		return note;
	}

	public void setNote(final String note) {
		this.note = note;
	}

	public String wateringInfo(Flower flower) {
		return flower.getName() + flower.getLastWatering() + flower.getLastWatering().plusDays(frequencyOfWateringInDays);
	}

	public void parseFlower(String record){


	}

	public static Flower readText(String input){
	String[] text = input.split(DELIMITER);
	int numberOfRecord = text.length;

	String name = text[0];
	String notes = text[1];
	int frequencyOfWatering = Integer.parseInt(text[2]);
	LocalDate planted = LocalDate.parse(text[3]);
	LocalDate lastWatering = LocalDate.parse(text[4]);

	return new Flower(name, notes, frequencyOfWatering, planted, lastWatering);
	}



}
