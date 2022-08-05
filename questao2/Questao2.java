// Sávia Christine Silva Nascimento

/* 2 - Escreva um sistema que receba valores de base e altura de um triângulo e 
 verifiquese são valores válidos (positivos maiores que zero). Em caso afirmativo, 
 calculeeimprima na tela a área do triângulo.*/

package br.com.empiricus.questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do triangulo:");
		double base = sc.nextDouble();
		System.out.println("Digite o valor da altura do triangulo:");
		double altura = sc.nextDouble();
		
		if(base > 0 && altura > 0) {
			
			System.out.println("A área do triangulo de base " + base + " e altura " + altura + " é igual a " + areaTriangulo(base, altura));
		}else {
			System.out.println("valores inválidos.");
		}

	}
	
	public static double areaTriangulo(double base, double altura) {
		return (base * altura) /2;
	}

}
