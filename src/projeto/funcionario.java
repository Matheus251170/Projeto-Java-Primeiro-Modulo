package Teste;

public class funcionario extends pessoa{
	
	private int cod;
	private String cpf;
	private String endereco;
	
	public funcionario(String nome, String email, int telefone, int idade, int cod, String cpf,String endereco)
	{
		super(nome, email, telefone, idade);
		this.cod = cod;
		this.cpf =cpf;
		this.endereco = endereco;
	}
	
	public String getInfo()
	{
		return "\nNome do funcionário: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nIdade: " 
		+ super.getIdade() + "\nTelefone: " + super.getTelefone() + "\nCódigo do funcionário: " + this.getCod() ;
		
	}
	public String getInfoCliente()
	{
		return "\nNome do cliente: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nIdade: " 
		+ super.getIdade() + "\nTelefone: " + super.getTelefone() + "\nCódigo: " + this.getCod() +  "\nCPF: " + this.getCpf()
		+"\nEndereço: " + this.getEndereco();
		
	}
	
	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}

