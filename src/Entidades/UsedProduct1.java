package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct1 extends Product1{

	private Date manufactureDate;
	
	SimpleDateFormat data = new SimpleDateFormat ("dd/MM/YYYY");
	
	public UsedProduct1() {
		super();
	}

	public UsedProduct1(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName() + " (used) $ " + totalPrice() +
		"(Manufacture date:  " + data.format(getManufactureDate()) + " )";
	}
	
	@Override
	public Double totalPrice() {
		return super.totalPrice();
	}
	
}
