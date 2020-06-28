package Execucoes;

import java.util.Scanner;

import Entidades.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Student estudante1=new Student();
		estudante1.name=input.nextLine();
		estudante1.nota1=input.nextDouble();
		estudante1.nota2=input.nextDouble();
		estudante1.nota3=input.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", estudante1.total());
		
		System.out.println(estudante1.verificacao());
		
		input.close();
	}

}
