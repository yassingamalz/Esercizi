package it.begear.corso.modulo1.es2;

public class Persona {

	private String nome;
	private String cognome;
	
	
	
	
	public String getNome() {
		return nome;
		
	}
	public Persona(String nome, String cognome) {
		setNome(nome);
		setCognome(cognome);
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	
	
	
}
