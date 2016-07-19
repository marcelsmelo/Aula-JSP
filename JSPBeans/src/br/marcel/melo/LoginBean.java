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
		if(this.username.equals("marcel") && this.password.equals("marcel")){
			setError("");
			return true;
		}
		setError("Usuário ou senha incorretos. Tente Novamente!");
		return false;
	}

}
