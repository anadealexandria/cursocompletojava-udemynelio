package Execucoes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int m = entrada.nextInt();
		int n = entrada.nextInt();
				
		int matriz [][]=new int [m][n];
		
		for(int i=0 ; i<matriz.length ; i++) {
			for(int j=0 ; j<matriz[i].length ; j++) {
				matriz [i][j]=entrada.nextInt();
				
			}
		}
		entrada.nextLine();
		
		int numero = entrada.nextInt();
		for(int i=0 ; i<matriz.length ; i++) {
			for(int j=0 ; j<matriz[i].length ; j++) {
				if(matriz[i][j]==numero) {
					System.out.printf("Position: %d , %d", i, j);
					if(j>0) {
						System.out.println("Left: " + matriz[i][j-1] );
					}
					if(i>0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j<matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i<matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
								
				}
				
			}
			
		}
		entrada.close();

	}

}
