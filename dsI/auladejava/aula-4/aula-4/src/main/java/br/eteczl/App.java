package br.eteczl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ProjGradleBD.persistence.ConectionFact;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection c = new ConectionFact().getConnection();
       System.out.println(c);
       try {
        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("select * from users; ");
        while(rs.next()){
            String nome = rs.getString("nome");
            System.out.println(nome);
        }
    } catch (SQLException e) {

        e.printStackTrace();
    }
    
    }

}
