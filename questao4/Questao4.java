// Sávia Christine Silva Nascimento

/* 3 - Crie uma hierarquia de classes conforme abaixo comos seguintes atributos e comportamentos 
 * (observe a tabela), utilize os seus conhecimentos e distribua as características de forma que 
 * tudo o que for comum a todos os animais fique na classe Animal:*/

package br.com.empiricus.questao4;

public class Questao4 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.emitirSom();
		
		Cachorro dog = new Cachorro();
		dog.setNome("doguiro");
		System.out.println(dog.getNome());
		dog.emitirSom();
		
		
		Cavalo horse = new Cavalo();
		horse.setNome("Scadufax");
		System.out.println(horse.getNome());
		horse.emitirSom();
		
		
		Preguica preguica = new Preguica();
		preguica.setNome("Priguicila");
		System.out.println(preguica.getNome());
		preguica.emitirSom();
		

	}

}
