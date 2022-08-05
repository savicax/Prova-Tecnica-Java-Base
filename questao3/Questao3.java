// Sávia Christine Silva Nascimento

/* 3 - Crie um programa que leia um número do teclado até que encontre umnúmero igual a zero. 
 * No final, mostre a soma dos números digitados.*/

package br.com.empiricus.questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		int soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			soma = soma + numero;
		}while(numero != 0);
		
		System.out.println("A soma dos numeros digitados é: " + soma);
		
		

	}

}
