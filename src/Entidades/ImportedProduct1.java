package Entidades;

public class ImportedProduct1 extends Product1 {

	private Double customsFee;

	public ImportedProduct1() {
		super();
	}

	public ImportedProduct1(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	@Override
	public String priceTag() {
		return super.priceTag() + "( Customs fee: $ " + getCustomsFee() + " )";
	}

	@Override
	public Double totalPrice() {
		return super.totalPrice() + customsFee;
	}

}
