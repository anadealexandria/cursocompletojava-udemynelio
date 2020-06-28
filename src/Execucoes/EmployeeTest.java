package Execucoes;
import java.util.Scanner;

import Entidades.Employee;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee empregado1=new Employee();
		System.out.println("Name: ");
		empregado1.name=input.nextLine();
		System.out.println("Gross salary: ");
		empregado1.grossSalary=input.nextDouble();
		System.out.println("Tax: ");
		empregado1.tax=input.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", empregado1.name, empregado1.NetSalary());
		System.out.println("Which percentage to increase salary?\n");
		empregado1.IncreaseSalary(input.nextDouble());
		
		System.out.printf("Update data: %s, $ %.2f", empregado1.name, empregado1.grossSalary);
		
		input.close();
	}

}
