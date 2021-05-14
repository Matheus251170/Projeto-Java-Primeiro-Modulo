import java.time.LocalDate;

public class Livro {
	
	private String titulo;
	private String autor;
	private String categoria;
	private String editora;
	private String isbn;
	private int quantidade;
	
	public Livro(String titulo, String autor, String categoria, String editora, String isbn, int quantidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.editora = editora;
		this.isbn = isbn;
		this.quantidade = quantidade;
		
	}

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria
				+ ", editora=" + editora + ", isbn=" + isbn + ", quantidade=" + quantidade + "]";
	}
	
	

	
}
