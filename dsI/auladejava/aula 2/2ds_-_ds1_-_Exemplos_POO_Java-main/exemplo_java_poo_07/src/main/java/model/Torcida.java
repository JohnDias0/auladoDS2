package model;
import java.util.ArrayList;

public class Torcida {
    
    
    public static void main( String[] args )
    {    	
        // Instânciando as duas Pessoas;
        Pessoa p1 = new Pessoa("Mayke", 19);
        Pessoa p2 = new Pessoa("Luis", 19);
        Pessoa p3 = new Pessoa("Jonas", 18);
        Pessoa p4 = new Pessoa("Jonathan", 17);
        Pessoa p5 = new Pessoa("João", 17);
        Pessoa p6 = new Pessoa("Igor", 16);
        // Criando um grupo de pessoas atráves de uma ArrayList;
        // O "Pessoa" dentro dos "<>" está sendo considerado um objeto generico, ou seja, ele
        //  é um generic e então aceita um número maior de tipos de atributos;
        ArrayList <Pessoa> grupo = new ArrayList<>();
        grupo.add(p1); //Adicionando elas ao grupo;
        grupo.add(p2);
        grupo.add(p3);
        grupo.add(p4);
        grupo.add(p5);
        grupo.add(p6);

    }
    //Mandando mandar no console o nome delas;
    // Só consigo mandar o nome delas graças ao Override do "toString()" no objeto Pessoa;
    // Se não retornaria "model.Pessoa@" e um monte de números após o "@";    
}
