package br.marcel.melo.bean;

public class LoginBean {
	private String usuario;
	private String senha;
	private String erro;
	
	public LoginBean() {
		super();
		this.usuario = "";
		this.senha = "";
		this.erro = "";
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public boolean login(){
		if(this.usuario.equalsIgnoreCase("marcel") 
				&& this.senha.equalsIgnoreCase("marcel")){
			this.erro = "";
			return true;
		}else{
			this.erro = "Login incorreto. Tente novamente!";
			return false;
		}
	}
	
}
