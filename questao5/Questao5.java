// Sávia Christine Silva Nascimento

/* 4 - Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com 
 * Collection do tipo ArrayList do Java para manipular os dados desse estoque, 
 * o programa deverá atender as seguintes funcionalidades:*/

package br.com.empiricus.questao5;

import java.util.ArrayList;
import java.util.Scanner;


public class Questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> estoque = new ArrayList<>();
		
		System.out.print("Quantos itens: ");
		int itens = sc.nextInt();
		
		for(int i = 0; i < itens; i++) {
			System.out.println("Código: ");
			int codigo = sc.nextInt();
			
			System.out.println("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			sc.nextLine();

			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			estoque.add(new Produto(codigo, quantidadeProduto, nome)); //adicionando itens
			
		}
		System.out.println("Estouque inteiro:");
		for(Produto i : estoque) {
			System.out.println(i);
		}
		System.out.println();
		estoque.remove(0); //removendo itens
		
		System.out.println("Estouque apos remoção de itens:");
		for(Produto i : estoque) {
			System.out.println(i);
		}
		
		

	}

}
