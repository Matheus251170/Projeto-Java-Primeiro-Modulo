package projeto;

public class funcionario extends pessoa{
	
	
	
	public funcionario(String nome, String email, int telefone, int idade, int cod)
	{
		super(nome, email, telefone, idade, cod);
	}
	
	public String getInfo()
	{
		return "\nNome do funcion�rio: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nIdade: " 
		+ super.getIdade() + "\nTelefone: " + super.getTelefone() + "\nC�digo do funcion�rio: " + super.getCod() ;
		
	}
	
}
