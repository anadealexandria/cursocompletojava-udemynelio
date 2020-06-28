package Execucoes;

import java.util.Scanner;

import Entidades.CurrencyConverter;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dolar = entrada.nextDouble();

		System.out.println("How many dollars will be bougth?");
		double valor =entrada.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.ValorCorrente(valor, dolar));
		entrada.close();
	}
    	
}