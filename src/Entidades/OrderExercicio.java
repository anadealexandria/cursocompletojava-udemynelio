package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enuns.OrderStatus;


public class OrderExercicio {
	private Date moment;
	private OrderStatus status;

	private ClientExercicio cliente;	
	private List<OrderItemExercicio> pedidoDeItens = new ArrayList<>();
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public OrderExercicio() {
		
	}
		
	public OrderExercicio(Date moment, OrderStatus status, ClientExercicio cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
		
	}



	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ClientExercicio getCliente() {
		return cliente;
	}

	public void setCliente(ClientExercicio cliente) {
		this.cliente = cliente;
	}

	public void addPedidoDeItens(OrderItemExercicio itens) {
		pedidoDeItens.add(itens);

	}

	public void removePedidoDeItens(OrderItemExercicio itens) {
		pedidoDeItens.remove(itens);
	}

	public Double total() {
		double sum = 0;
		
		for (OrderItemExercicio compra : pedidoDeItens) {
			sum += compra.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		saida.append("ORDER SUMMARY: \n");
		saida.append("Order moment: " + date.format(moment) + "\n");
		saida.append("Order statud: " + status + "\n");
		saida.append("Client: " + cliente.getName() + " (" + date1.format(cliente.getBirthDate())+ ") " + " - " + cliente.getEmail() + "\n");
		saida.append("Order items: \n");
		for(OrderItemExercicio itens : pedidoDeItens) {
			saida.append(itens.getProduct().getName() + ", $ " + itens.getProduct().getPrice() +", Quantity: " 
		+ itens.getQuantity() + ", Subtotal: $" + itens.subTotal() + "\n" );
		}
		saida.append("Total price: $ " + total());
		return saida.toString();
	}

}

