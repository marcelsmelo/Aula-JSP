package br.marcel.melo;

public class ContadorBean {
	private int contador;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void incrementaContador(){
		this.contador++;
	}

}
