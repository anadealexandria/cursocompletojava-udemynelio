package Execucoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Empregados1;
import Entidades.EmpregadosTerceirizados;

public class Empregados1Test {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Empregados1> empregados = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = entrada.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("Employee #%d data: \n", i);
			System.out.print("Outsoured (y/n)?");
			char outsoured = entrada.next().charAt(0);
			System.out.print("Name: ");
			entrada.nextLine();
			String name=entrada.nextLine();
			System.out.print("Hours: ");
			int hours=entrada.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = entrada.nextDouble();
			
			if(outsoured == 'n') {
				Empregados1 empregado=new Empregados1(name, hours, valuePerHour);
				empregados.add(empregado);
				
				
			}
			if(outsoured == 'y') {
				System.out.print("Additional charge: ");
				double cobrancaAdcional = entrada.nextDouble();
				Empregados1 empregadoTerceiro=new EmpregadosTerceirizados(name, hours, valuePerHour, cobrancaAdcional);
				empregados.add(empregadoTerceiro);
				
			}			
			
		}
		System.out.println();
		System.out.print("PAYMENTS:");
		
		System.out.println(empregados.toString());
		
		entrada.close();
	}

}
