// Sávia Christine Silva Nascimento

/* 1- O custo ao consumidor de um carro novo, é a soma do custo de 
fábrica com a percentagem do distribuidor e dos impostos 
(aplicados ao custo de fábrica). Supondoque a percentagem do 
distribuidor seja de 28% e os impostos de 45%, escrevaumsistema que 
leia o custo de fábrica de um carro e imprima na tela o custoaoconsumidor.*/

package br.com.empiricus.questao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro: ");
		
		double custoDeFabrica = sc.nextDouble();
		
		double custoAoConsumidor = custoDeFabrica + custoDoDistribuidor(custoDeFabrica) + custoDosImpostos(custoDeFabrica);
		
		System.out.println("O custo ao consumidor do carro novo é R$ " + custoAoConsumidor);
		
	}
	
	public static double custoDoDistribuidor(double custoDeFabrica) {
		return custoDeFabrica * 0.28;
	}
	
	public static double custoDosImpostos(double custoDeFabrica) {
		return custoDeFabrica * 0.45;
	}

}
