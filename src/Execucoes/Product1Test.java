package Execucoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entidades.ImportedProduct1;
import Entidades.Product1;
import Entidades.UsedProduct1;

public class Product1Test {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the number of products: ");
		int n = entrada.nextInt();
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		List<Product1> lista = new ArrayList<>();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.printf("Product #%d data:\n", i );
			System.out.println("Common, used or imported (c/u/i)?");
			char opcao = entrada.next().charAt(0);
			entrada.nextLine();
			System.out.println("Name: ");
			String name = entrada.nextLine();
			System.out.println("Price: ");
			double price = entrada.nextDouble();
			
			if(opcao == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = entrada.nextDouble();
				Product1 prod1 = new ImportedProduct1(name, price, customsFee);
				lista.add(prod1);
				
			}
			if(opcao == 'c') {
				Product1 prod2 = new Product1(name, price);
				lista.add(prod2);
			}
			if(opcao == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date=entrada.next();
				Date manufactureDate = data.parse(date);
				Product1 prod3 = new UsedProduct1(name, price, manufactureDate);
				lista.add(prod3);
				
			}
		}
		System.out.println();
		System.out.print("PRICE TAGS:\n");
		for(Product1 produtos: lista) {
			System.out.println(produtos.priceTag());
		}
		entrada.close();
	}

}
