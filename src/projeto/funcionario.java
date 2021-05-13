package projeto;

public class funcionario extends pessoa{

	private String nomeBiblioteca;
	private int alteraCod;
	
	public funcionario(String nome, String email, String nomeBiblioteca, int telefone, int cod, int alteraCod)
	{
		super(nome, email, telefone, cod);
		
		this.alteraCod = alteraCod;
		this.nomeBiblioteca = nomeBiblioteca;
	}

	//criação dos metodos
	
	public void alteraCod()
	{
		
	}
	
	//getters and setters
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}

	public int getAlteraCod() {
		return alteraCod;
	}

	public void setAlteraCod(int alteraCod) {
		this.alteraCod = alteraCod;
	}
	
	

}
