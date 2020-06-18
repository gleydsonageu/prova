package exemplos;

import java.io.InputStream;
import java.util.Scanner;

/*
 * Implemente um programa em Java que possua dois vetores de 10 números inteiros, A e B. 
 * O programa deve preencher o vetor A com valores digitados pelo usuário. 
 * O vetor B deve ser preenchido da seguinte forma: os elementos de índice par 
 * são os correspondentes de A divididos por 2 e os elementos de índice ímpar são os 
 * correspondentes de A multiplicados por 3. Ao final, o programa deverá exibir os 
 * dois vetores (A e B).*/

public class Questão1Prova {
	public static void main(String[] args) {
		Scanner lerNumero = new Scanner (System.in); 
		int n = 10;
		int y = 10;
		int vetorA [] = new int[n];
		int vetorB [] = new int[y];
		int i;
		
		for(i=0; i <n;i++) {
			System.out.printf("Informe o valor: ");
		      vetorA[i] = lerNumero.nextInt();
		}
		
		System.out.println("Numeros do vetor A:");
		for (i = 0; i <n;i++) { 
			System.out.printf(" "+vetorA[i]);
		}
		System.out.println("\n");
		System.out.println("Numeros do vetor B:");
		for(i=0; i<y;i++) {
			if (vetorA[i]%2 ==0)  {
				vetorB[i] = vetorA[i];

			} else if (vetorA[i]%2 == 1);
			//	vetorB[i] = vetorA[i]*3;
		}
		for (i = 0; i <n;i++) { 
			System.out.printf(" "+vetorB[i]);
		}
	}	
}
