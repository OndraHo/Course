package queue;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Patient {
	private String name;
	private LocalDate birthDate;
	private int id;
	private ReasonOfVisit reasonOfVisit;
	private String descriptionOfVisit;
	private LocalDate dateOfVisit;

	private static int idCounter = 0;

	public Patient(final String name, final LocalDate birthDate) { //register patient
		this.name = name;
		this.birthDate = birthDate;
		this.id = ++idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(final LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public ReasonOfVisit getReasonOfVisit() {
		return reasonOfVisit;
	}

	public void setReasonOfVisit(final ReasonOfVisit reasonOfVisit) {
		this.reasonOfVisit = reasonOfVisit;
	}

	public String getDescriptionOfVisit() {
		return descriptionOfVisit;
	}

	public void setDescriptionOfVisit(final String descriptionOfVisit) {
		this.descriptionOfVisit = descriptionOfVisit;
	}

	public LocalDate getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(final LocalDate dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	protected Patient appointPatient(Patient patient, ReasonOfVisit reasonOfVisit, LocalDate visitDate){
		patient.setReasonOfVisit(reasonOfVisit);
		patient.setDateOfVisit(visitDate);

		return patient;
	}


}