package fleet;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Car {
	Brand brand;
	String model;
	String licencePlate;
	LocalDate lastCheckDate;
	int mileage;

	int price;
	boolean readyForSale;
	float consumption;

	public Car(final Brand brand, final String model, final String licencePlate, final LocalDate lastCheckDate, final int mileage) {
		this.brand = brand;
		this.model = model;
		this.licencePlate = licencePlate;
		this.lastCheckDate = lastCheckDate;
		this.mileage = mileage;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(final Brand brand) {
		this.brand = brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(final int mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(final String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public boolean isReadyForSale() {
		return readyForSale;
	}

	public void setReadyForSale(final boolean readyForSale) {
		this.readyForSale = readyForSale;
	}

	public float getConsumption() {
		return consumption;
	}

	public void setConsumption(final float consumption) {
		this.consumption = consumption;
	}


	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(final String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public LocalDate getLastCheckDate() {
		return lastCheckDate;
	}

	public void setLastCheckDate(final LocalDate lastCheckDate) {
		this.lastCheckDate = lastCheckDate;
	}
}