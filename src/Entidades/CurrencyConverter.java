package Entidades;

public class CurrencyConverter {

	
	
	public static double ValorCorrente(double valor, double dolar) {
		double total = (dolar * valor) + (valor * dolar) * 0.06;
		return total;
	}
	
	
}
