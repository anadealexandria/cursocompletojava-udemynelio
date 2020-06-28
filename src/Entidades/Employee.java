package Entidades;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double percentage) {
		this.grossSalary= (grossSalary*percentage)/100 + NetSalary();
	}
}