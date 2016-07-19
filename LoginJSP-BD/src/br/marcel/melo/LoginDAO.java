package br.marcel.melo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	public boolean login(String user, String password){
		Connection con = ConexaoMySQL.getConexaoMySQL(); 
		
		String sql = "SELECT id FROM login WHERE nome = ? and senha = ?;";
		try {
		
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			return rs.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
