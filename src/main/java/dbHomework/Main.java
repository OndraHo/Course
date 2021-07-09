package dbHomework;

import java.math.BigDecimal;

import dbHomework.src.Item;

/**
 * @author ondrej.hosek
 */

public class Main {

	public static void main(String[] args) {

		GoodMethods goodMethods = new GoodMethods();
		goodMethods.updatePrice(1, new BigDecimal(887711)); //OK
		goodMethods.loadItemById(1); // OK
		goodMethods.loadAllAvailableItems(); // OK
		goodMethods.deleteAllOutOfStockItems(); // OK
		goodMethods.saveItem(new Item(45456, 02020202, "SuperItem", "Vhodne pro deti", 4488, BigDecimal.valueOf(888.666)));

	}
}