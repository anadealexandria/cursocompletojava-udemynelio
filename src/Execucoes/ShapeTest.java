package Execucoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.CircleShape;
import Entidades.RectangleShape;
import Entidades.Shape;
import Enuns.ColorShape;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Enter the number of shapes:");
		int n = entrada.nextInt();
		List <Shape> areas = new ArrayList<>();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.printf("Shape #%d data:\n ", i);
			System.out.println("Retangle or Circle (r/c)?");
			int opcao = entrada.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED):");
			ColorShape color = ColorShape.valueOf(entrada.next());
			
			if(opcao == 'r') {
				System.out.println("Width: ");
				double width = entrada.nextDouble();
				System.out.println("Height: ");
				double height = entrada.nextDouble();	
				Shape retangulo = new RectangleShape(color,width, height);
				areas.add(retangulo);
			}
			if(opcao == 'c') {
				System.out.println("Radius: ");
				double radius = entrada.nextDouble();
				Shape circulo = new CircleShape(color, radius);
				areas.add(circulo);
			}
		}
		System.out.println("SHAPE AREAS: ");
		for(Shape formas : areas) {
			System.out.println(String.format("%.2f", formas.area()));
		}
		
		entrada.close();
	}

}
