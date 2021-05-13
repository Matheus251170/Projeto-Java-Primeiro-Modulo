package projeto;

public class pessoa {
	
	private String nome;
	private int cod;
	private String email;
	private int telefone;
	
	
	//criação de metodos
	public pessoa(String nome, String email, int cod, int telefone)
	{
		this.cod = cod;
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
	}

	
	//getters and setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	

}
