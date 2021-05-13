package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca {

	public static void main(String[] args) {
		
		int op, cod;

		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		funcionario func1 = new funcionario("Celso", "alg@email.com", 25, 9898989, 1);
		funcionario func2 = new funcionario("cebola", "cebola@email.com", 23, 9898989, 2);
		funcionario func3 = new funcionario("Celsa", "alg@email.com", 22, 9898989, 3);
		
		funcionario[] func = new funcionario[3];
		
		
		System.out.println("Escolha uma opção: \n1. Entrar como funcionário.\n2. Entrar como cliente");
		op = leia.nextInt();
		
		switch(op)
		{
			case 1:
				System.out.print("\nInsira seu código para entrar: ");
				cod = leia.nextInt();
				 	
					if(cod == 1)
					{
						System.out.println("funcionario " + func1.getNome() + " logado");
					}
					else if(cod == 2)
					{
						System.out.println("funcionario " + func2.getNome() + " logado");
					}
					else if(cod == 3)
					{
						System.out.println("funcionario " + func3.getNome() + " logado");
					}
					else
					{
						System.out.println("Código inválido!");
					}
					
					do {
						System.out.println("\n---------------------");
						System.out.println("\n(1) Adicionar livros ao estoque");
						System.out.println("\n(2) Remover livros do estoque");
						System.out.println("\n(3) Atualizar livro");
						System.out.println("\n(4) Mostrar livros disponiveis");
						System.out.println("\n(0) Sair do estoque");
						System.out.println("\n Digite sua opção: ");
						op = leia.nextInt();
						
						switch(op) {
						case 1:
							leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
							System.out.println("\nDigite o nome do livro que deseja adicionar ao estoque: ");
							String produto = leia.nextLine();
							estoque.add(produto);
							break;
							
						case 2:
							leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
							System.out.println("\nDigite o nome do livro que deseja retirar do estoque: ");
							String produto1 = leia.nextLine();
							if(estoque.contains(produto1)) {
								estoque.remove(produto1);
							}
							else {
								System.err.println("\nLivro não existe no estoque.");
							}
							break;
						
						case 3:
							leia.nextLine();//lê uma String para esvaziar o buffer de memória (para não ficar sujeira na memória
							System.out.println("\nMostrando os produtos do estoque:");
							System.out.println(estoque);
							break;
							
						default:
							System.out.println("\nSaindo do acervo");
						}
					}while(op!=0);//condição de saída
					
				break;
					
			case 2:
				System.out.print("\nEscolha o que quer fazer: ");
				
				
			}

	}

}
