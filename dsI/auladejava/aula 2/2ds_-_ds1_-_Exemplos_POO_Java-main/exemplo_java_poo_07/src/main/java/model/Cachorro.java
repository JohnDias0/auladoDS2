package model;

public class Cachorro extends Animal {

	public String nome;
	
	public Cachorro(String raca, String sexo, String tipo, String nome) {
		super(raca,sexo,tipo);
		this.nome = nome;
		
	}
	//Método da class pai Animal sendo usado pelo Cachorro, mas com os Ajustes necessarios para ser um cachorro fazendo som
	public void fazersom(){
		//O Animal Cachorro também emiti som, mas com o seu ruído único.
		System.out.println("AU AU");
	}
		
}
