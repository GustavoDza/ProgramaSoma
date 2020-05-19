package com.soma;

import java.util.Scanner;

/*1 - Deverá ser desenvolvido um programa que efetue a leitura de dois valores numéricos. Faça a 
 * operação de adição entre dois valores e apresente o resultado obtido.*/

public class soma {
	
	public static void main(String[] args) {
		
		int num1, num2, soma;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Informe o valor do segundo número:");
		num2 = ler.nextInt();
		soma = num1 + num2;
		System.out.printf("O resultado da soma é: %d", soma);
		ler.close();
	}
}
