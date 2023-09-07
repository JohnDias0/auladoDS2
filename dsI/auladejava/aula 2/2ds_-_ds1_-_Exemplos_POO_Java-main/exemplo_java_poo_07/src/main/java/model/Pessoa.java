package model;

public class Pessoa {
	// Criando as váriaveis (atributos) desta classe;
	// public String nome; // Atributo "nome";
	// public int idade; // Atributo "idade";

	
	private String nome;
	private int idade;


	// Construtor;
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Criando um método (função dentro de uma classe) "andar";
	public void andar() {
		System.out.println("*Andando*...");
	}

	// Métodos de acesso para o atributo 'nome'
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Métodos de acesso para o atributo 'idade'
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			System.out.println("Idade inválida.");
		}
	}
}
