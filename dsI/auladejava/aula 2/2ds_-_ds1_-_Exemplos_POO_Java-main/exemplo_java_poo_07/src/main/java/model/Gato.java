package model;

public class Gato extends Animal {
	
	
	public String nome;
	
	
	public Gato(String raca, String sexo, String tipo, String nome) {
		super(raca,sexo,tipo);
		this.nome = nome;

	}
	//Método da class pai Animal sendo usado pelo Gato, mas com os Ajustes necessarios para ser um gato fazendo som
	// Esse é o Polimorfismo
	public void fazersom() {
		//O Animal Gato emiti som, mas com o seu ruído único
		System.out.println("Miau Miau");
	}

}
