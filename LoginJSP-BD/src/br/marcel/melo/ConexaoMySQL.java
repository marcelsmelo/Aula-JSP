package br.marcel.melo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	
	public static Connection getConexaoMySQL(){
		Connection connection = null;
		
		String driverName = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			
			// Configurando a nossa conexão com um banco de dados//
	        String serverName = "localhost";    //caminho do servidor do BD
	        String mydatabase ="Default";        //nome do seu banco de dados
	        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	        String username = "root";        //nome de um usuário de seu BD      
	        String password = "root";      //sua senha de acesso
	
	        connection = DriverManager.getConnection(url, username, password);
	
	
//	        //Testa sua conexão//
//	        if (connection != null) {
//	            System.out.println("STATUS--->Conectado com sucesso!");
//	        } else {
//	        	System.out.println("STATUS--->Não foi possivel realizar conexão");
//	        }
	
	        return connection;
        
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean fecharConexao(){
		try {
			ConexaoMySQL.getConexaoMySQL().close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//Método que reinicia sua conexão//
    public static Connection reiniciarConexao() {
    	ConexaoMySQL.fecharConexao();
        return ConexaoMySQL.getConexaoMySQL();
 
    }

}
