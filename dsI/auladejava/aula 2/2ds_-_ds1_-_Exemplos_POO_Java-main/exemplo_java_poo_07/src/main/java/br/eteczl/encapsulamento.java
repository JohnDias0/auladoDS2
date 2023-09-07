package br.eteczl;
import model.Pessoa;

public class encapsulamento {
	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mayke", 25);
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        pessoa.setNome("Luis");
        pessoa.setIdade(-30);  // Isso imprimirá "Idade inválida."

        System.out.println("Novo nome: " + pessoa.getNome());
        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}
