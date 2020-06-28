package Execucoes;

import java.util.Scanner;

import Entidades.RegistroDeQuartos;

public class RegistroDeQuartosTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = entrada.nextInt();
		int numberRooms=0;
		RegistroDeQuartos rooms []= new RegistroDeQuartos[10];
		
		for(int i=0 ; i <n ; i++) {
			entrada.nextLine();
			System.out.print("Name: ");
			String name = entrada.nextLine();
			System.out.print("Email: ");
			String email = entrada.nextLine();
			System.out.print("Room: ");
			numberRooms = entrada.nextInt();
			
			rooms[numberRooms] = new RegistroDeQuartos (name, email);
			
		}
		
		System.out.println("Busy rooms:\n");
		for(int i=0 ; i<rooms.length ; i++) {
			if(rooms[i]!=null)
			System.out.println(i + ":"+ rooms[i]);
		}
		
		entrada.close();
	}

}
