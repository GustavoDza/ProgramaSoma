package com.soma;

import java.util.Scanner;

/*1 - Dever� ser desenvolvido um programa que efetue a leitura de dois valores num�ricos. Fa�a a 
 * opera��o de adi��o entre dois valores e apresente o resultado obtido.*/

public class soma {
	
	public static void main(String[] args) {
		
		int num1, num2, soma;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Informe o valor do segundo n�mero:");
		num2 = ler.nextInt();
		soma = num1 + num2;
		System.out.printf("O resultado da soma �: %d", soma);
		ler.close();
	}
}
