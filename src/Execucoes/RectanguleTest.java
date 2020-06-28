package Execucoes;

import java.util.Scanner;

import Entidades.Rectangule;

public class RectanguleTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Rectangule r1=new Rectangule();
		
		System.out.println("Enter rectangle width and height: ");
		r1.width=input.nextDouble();
		r1.height=input.nextDouble();
		
		System.out.printf("AREA = %.2f\n", r1.Area());
		System.out.printf("PERIMETER = %.2f\n", r1.Perimeter());
		System.out.printf("DIAGONAL = %.2f\n", r1.Diagonal());
		
		input.close();
	}

}
