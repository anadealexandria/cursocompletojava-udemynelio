package Entidades;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double resto;
	
	public double total() {
		return nota1+nota2+nota3;
	}
	
	public String verificacao() {
		if(total()>=60.00) {
			return "PASS";
		}else {
			resto= 60.00-total();
			return "FAILED\n" + "MISSING " + resto + " POINTS";
		
		}
	}
}
