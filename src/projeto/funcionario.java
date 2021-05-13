package projeto;

public class funcionario extends pessoa{
	
	private int cod;
	
	public funcionario(String nome, String email, int telefone, int idade, int cod)
	{
		super(nome, email, telefone, idade);
		this.cod = cod;
	}
	
	public String getInfo()
	{
		return "\nNome do funcionário: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nIdade: " 
		+ super.getIdade() + "\nTelefone: " + super.getTelefone() + "\nCódigo do funcionário: " + this.getCod() ;
		
	}
	
	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}
}

