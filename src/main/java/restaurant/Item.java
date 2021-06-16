package restaurant;

/**
 * @author ondrej.hosek
 */

public class Item {
	private String title;
	private int price;
	private int quantity;

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

//	5. ukol
	public void showAllUniqueItems(){}
}