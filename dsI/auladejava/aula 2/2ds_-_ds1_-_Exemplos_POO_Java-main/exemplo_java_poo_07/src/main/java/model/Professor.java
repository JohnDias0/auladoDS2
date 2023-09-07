package model;

// Tudo que a "Pessoa" tem, agora o "Professor" terá
public class Professor extends Pessoa{

	public Professor (String nome, int idade) {
		super(nome, idade);
	}
	
	// Criando um método "lecionar" que somente o Professor podera fazer;
	public void lecionar() {
		System.out.println("Estou ensinando programação...");
	}
}
