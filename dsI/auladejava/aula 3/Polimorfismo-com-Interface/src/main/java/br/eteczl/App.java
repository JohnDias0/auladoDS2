package br.eteczl;

import java.util.ArrayList;

import br.eteczl.model.Automovel;
import br.eteczl.model.Caminhao;
import br.eteczl.model.Carro;

/**
 * Hello world!
 *
 */
public class App 
{
    private ArrayList<Automovel> automovels = new ArrayList<Automovel>();
    public static void main( String[] args )
    {
        App app = new App();

        app.automovels.add(new Carro());
        app.automovels.add(new Caminhao());

        for(int i = 0; i<app.automovels.size();i++){
            System.out.println(app.automovels.get(i));
        }
    }
}
