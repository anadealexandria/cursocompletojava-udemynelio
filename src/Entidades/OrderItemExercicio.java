package Entidades;

public class OrderItemExercicio {
	private Integer quantity;
	private Double price;

	private ProductExercicio product;

	public OrderItemExercicio() {
	}	

	public OrderItemExercicio(Integer quantity, Double price, ProductExercicio product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductExercicio getProduct() {
		return product;
	}

	public void setProduct(ProductExercicio product) {
		this.product = product;
	}

}
