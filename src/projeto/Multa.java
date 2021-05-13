import java.util.Scanner;


public class Multa {
	

public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	String nome;
	int diasLivro;
	double multa;
	
	
	System.out.println("\tInsira seu nome:");
	nome = leia.next();
	
	System.out.println("\n\tInsira a quantidade de dias com o livro: ");
	diasLivro = leia.nextInt();
	
	if (diasLivro > 7) {
		
		System.out.println("\nLimite de dias ultrapassado!!");
		
		multa = (diasLivro -7) * 2; //valor da multa 2 reais por dia
		
		System.out.println("\n"+nome+", sua multa tem o valor de: "+multa+" reais");
	}
	else{
		System.out.println("Livro devolvido com sucesso!!!");
	}
}
}
