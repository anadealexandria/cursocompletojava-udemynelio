package Execucoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class PessoaTest {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter the number of tax payers: ");
		int n = entrada.nextInt();
		List<Pessoa> lista = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: ", i);
			System.out.println("Individual or company (i/c)?");
			char opcoes = entrada.next().charAt(0);
			System.out.println("Nome: ");
			String nome = entrada.next();
			System.out.println("Anual income: ");
			double rendaAnual = entrada.nextDouble();

			if (opcoes == 'i') {
				System.out.println("Health expenditures: ");
				double gastosEmSaude = entrada.nextDouble();
				Pessoa fisica = new PessoaFisica(nome, rendaAnual, gastosEmSaude);
				lista.add(fisica);
			}
			if (opcoes == 'c') {
				System.out.println("Number of employees: ");
				int numeroDeFuncionarios = entrada.nextInt();
				Pessoa juridica = new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios);
				lista.add(juridica);
				
			}
		}
		double total = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa objetos : lista) {
			System.out.println(objetos.toString());
			total += objetos.impostoPago();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: ");
		System.out.printf("%.2f" , total);
		entrada.close();
	}

}
