package Execucoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.ClientExercicio;
import Entidades.OrderExercicio;
import Entidades.OrderItemExercicio;
import Entidades.ProductExercicio;
import Enuns.OrderStatus;

public class OrderExercicioTest {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter cliente data: \n");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		System.out.println();
		
		System.out.print("Email: ");
		String email = entrada.nextLine();
		System.out.println();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dataString = entrada.next();
		System.out.println("data:" + dataString);
		Date date = data.parse(dataString);
		entrada.nextLine();
		
				
		ClientExercicio cliente1 = new ClientExercicio(name, email, date);
		
		System.out.print("Enter Order data: \n");
		System.out.print("Status: ");
		OrderStatus status=OrderStatus.valueOf(entrada.next());
		System.out.println("How many items to this order?");
		int quantidade=entrada.nextInt();
		
		
		OrderExercicio pedido = new OrderExercicio(new Date(), status,  cliente1);
		for(int i=1; i<quantidade+1 ; i++) {
			System.out.print("Enter #" + i + " item data:\n");
			System.out.print("Product name: ");
			entrada.nextLine();
			String nameProduct = entrada.nextLine();
			
			System.out.print("Product price: ");
			double priceProduct = entrada.nextDouble();
			ProductExercicio product = new ProductExercicio(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");
			int quantityProduct = entrada.nextInt();
			
			OrderItemExercicio itens = new OrderItemExercicio(quantityProduct, priceProduct, product); 
			pedido.addPedidoDeItens(itens);		
			
		}
		System.out.println(pedido.toString());
		entrada.close();
	}

}
