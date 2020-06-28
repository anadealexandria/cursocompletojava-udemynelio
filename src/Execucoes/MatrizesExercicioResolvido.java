package Execucoes;

import java.util.Scanner;

public class MatrizesExercicioResolvido {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int contador=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Imprimir a diagonal principal: ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println("\n");
		System.out.println("Quantidade de números negativos: ");
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				if(mat[i][j]<0) {
					contador++;
				}
			}
		}
		System.out.println(contador);
		
		sc.close();
	}

}
