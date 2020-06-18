package exemplos;

import java.util.Scanner;

/**
 * Um número é considero primo se ele é só divisível por si próprio e por um. 
 * Escreva um programa em Java que peça para o usuário informar um número N maior 
 * que zero pelo teclado e imprima o N-ésimo numero primo informado. Por exemplo, 
 * se o usuário informar N = 1 o programa irá imprimir o primeiro número primo, que é 2. 
 * Se o usuário informar N = 3 o programa irá imprimir o terceiro número primo, que é 5.
 * */

public class Questao5Prova {

	public static void main(String[] args) {
	//	Scanner lerNumero = new Scanner (System.in);
		int n = 100;
		int vetorA [] = new int[n];
    	int numero;
		//System.out.println("Olá, Escreva um numero:");
	//	numero = lerNumero.nextInt();
		
    	for (int i = 1; i < n; i++) {
        	boolean eprimo = true;	
        for (int j=2; j< i ; j++) {
        	
        	if(i % j == 0)
        	eprimo = false;
        }
    		if(eprimo) {
    			System.out.println(i);
    		}
    	}
    	System.out.println("O numero primo eh: "+vetorA[10]);
//    	System.out.println(" ");
	}
}
