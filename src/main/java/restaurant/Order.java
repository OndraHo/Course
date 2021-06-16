package restaurant;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */

public class Order {
	private String name;
	private int order;
	private int tableNumber;
	private LocalDate date;
	private boolean cashPayment;


	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(final int order) {
		this.order = order;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(final int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public boolean isCashPayment() {
		return cashPayment;
	}

	public void setCashPayment(final boolean cashPayment) {
		this.cashPayment = cashPayment;
	}


	public void sumPrice(){}


	public void countOfSelledMeals(){}


//	4. ukol
	public void turnover(){}


	public void parseOrder(){

	}
}

