package projeto;

public class pessoa {
	
	private String nome;
	private String email;
	private int telefone;
	private int idade;
	private int cod;
	
	
	//criação de metodos
	public pessoa(String nome, String email, int telefone, int idade, int cod)
	{
		this.email = email;
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cod = cod;
	}

	
	//getters and setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
	

}
