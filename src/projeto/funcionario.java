package projeto;

import java.util.*;

public class funcionario extends pessoa{
	
	Scanner read = new Scanner(System.in);
	
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
