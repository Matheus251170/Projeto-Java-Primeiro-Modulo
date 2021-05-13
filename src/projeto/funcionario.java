package projeto;

public class funcionario extends pessoa{
	
	
	
	public funcionario(String nome, String email, int telefone, int idade, int cod)
	{
		super(nome, email, telefone, idade, cod);
	}
	
	public String getInfo()
	{
		return "\nNome do funcionário: " + super.getNome() + "\nEmail: " + super.getEmail() + "\nIdade: " 
		+ super.getIdade() + "\nTelefone: " + super.getTelefone() + "\nCódigo do funcionário: " + super.getCod() ;
		
	}
	
}
