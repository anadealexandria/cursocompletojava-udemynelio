package Execucoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Empregados;

public class EmpregadosTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Empregados empregado;
		String name = "";
		double salary = 0;
		int id=0;

		System.out.println("How many employees will be registered?");
		int numeros = entrada.nextInt();

		List<Empregados> list = new ArrayList<>();

		for (int i = 0; i < numeros; i++) {
			System.out.print("Id: ");
			id=entrada.nextInt();
			entrada.nextLine();
			System.out.print("Name: ");
			name = entrada.nextLine();
			System.out.print("Salary: ");
			salary = entrada.nextDouble();
			list.add(new Empregados (id, name, salary));
			
		}

		System.out.println("Enter the employee id that will have salary increase : ");
		final int auxId = entrada.nextInt();
		empregado = list.stream().filter(x -> x.getId() == auxId).findFirst().orElse(null);
		if(empregado == null) {
			System.out.println("This id does not exist!");
		}else {
			
			System.out.println("Enter the percentage: ");
			double percentage = entrada.nextDouble();
			empregado.increaseSalary(percentage);
		}
		entrada.nextLine();
		System.out.println("List of employees: ");

		for (Empregados objeto: list) {
			System.out.println(objeto);
		}
		
		entrada.close();
	}

}
