package model;

public class Animal {

	public String raca;
	public String sexo;
	public String tipo;
	
public Animal(String raca, String sexo, String tipo) {
	this.raca = raca;
	this.sexo = sexo;
	this.tipo = tipo;
	
}

	//Método que será usado como exemplo de polimorfismo
	public void fazersom () {
		//Todo Animal emiti som
		System.out.println("Fazendo Barulho");
	}
	
	
	
}
