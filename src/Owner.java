import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class Owner {
	String name;
	boolean vipClient;
	LocalDate dateOfBirth;
	String address;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public boolean isVipClient() {
		return vipClient;
	}

	public void setVipClient(final boolean vipClient) {
		this.vipClient = vipClient;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}
}