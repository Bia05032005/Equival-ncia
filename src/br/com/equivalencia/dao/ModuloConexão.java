
package br.com.equivalencia.dao;
import java.sql.*;

public class ModuloConexão {
    
    public static Connection conector() {
    //Metodo responsavel por estabelecer  a conexão com o banco de dados
    java.sql.Connection conexão = null;
    //A linha  abaixo chama o driver impotado de conexão
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3308/equivalencia";
    String user = "root";
    String password = "";
    
    //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexão = DriverManager.getConnection(url,user,password);
            return conexão;
        } catch (Exception e) {
            return null;
        }
    }    
    
}
