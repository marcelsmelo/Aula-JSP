package br.marcel.melo;

public class LoginBean {
	
	private String username = "";
	private String password = "";
	private String error = "";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public boolean login(){
		
		LoginDAO loginDAO = new LoginDAO();
		Boolean result = loginDAO.login(this.username, this.password);
		
		if(result){
			setError("");
			return true;
		}else{
			setError("Usuário ou senha incorretos. Tente Novamente!");
			return false;
		}
		
	}

}
