package Execucoes;

import java.util.Scanner;

import Entidades.ExercicioDesafio1;

public class ExercicioDesafioTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ExercicioDesafio1 conta1;
		
		System.out.print("Enter account number:");		
		int conta=input.nextInt();
		System.out.print("Enter account holder:\n");
		input.nextLine();
		String name=input.nextLine();
		input.next();
		input.nextLine();
		System.out.print("Is there na initial deposit (y/n)?\n");
		char resposta = input.next().charAt(0);
		input.nextLine();
		
		if(resposta=='n') {
			conta1 = new ExercicioDesafio1(conta, name);
		}else {
			System.out.println("Enter initial deposit value:\n");
			double valor = input.nextDouble();
			conta1 = new ExercicioDesafio1(conta, name, valor);
		}
		
		conta1.mostrarConta();
		
		System.out.println("Enter a deposit value:");
		conta1.Deposito(input.nextDouble());
		
		conta1.contaAtualizada();
		
		System.out.println("Enter a withdraw value:");
		conta1.Saque(input.nextDouble());
		
		conta1.contaAtualizada();
		
		input.close();
	}

}
