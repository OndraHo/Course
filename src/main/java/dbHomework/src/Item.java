package dbHomework.src;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author ondrej.hosek
 */

@Entity
@Table(name = "ITEM")
public class Item extends Object {

	public Item() {
	}

	public Item(final Integer partNo, final Integer serialNo, final String name, final String description, final Integer numberInStock, final BigDecimal price) {
		this.partNo = partNo;
		this.serialNo = serialNo;
		this.name = name;
		this.description = description;
		this.numberInStock = numberInStock;
		this.price = price;
	}

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "PART_NO")
	private Integer partNo;

	@Column(name = "SERIAL_NO")
	private Integer serialNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "NUMBER_IN_STOCK")
	private Integer numberInStock;

	@Column(name = "PRICE")
	private BigDecimal price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPartNo() {
		return partNo;
	}

	public void setPartNo(final Integer partNo) {
		this.partNo = partNo;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(final Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(Integer numberInStock) {
		this.numberInStock = numberInStock;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}