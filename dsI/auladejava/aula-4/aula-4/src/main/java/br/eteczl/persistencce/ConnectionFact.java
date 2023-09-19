package ProjGradleBD.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFact {
    
    private Connection conn = null;
    private String StringDeConexao = "jbc:mysql://localhost:3306/etec";

    public Connection getConnection(){
    
        try {
            DriverManager.getConnection(this.StringDeConexao, "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.conn;
    
    }
}
    

 
