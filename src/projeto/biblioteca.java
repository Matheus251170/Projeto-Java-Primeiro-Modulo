package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class biblioteca {

	public static void main(String[] args) {
		
		int op, cod, cont = 0;

		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		Map<String, String> usuarios = new HashMap<>();
		
	
		
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
							System.out.println("\n(3) Mostrar livros disponiveis");
							System.out.println("\n(4) Visualizar informações de funcionário");
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
								
							case 4: 
								
								if(cod == 1)
								{
									System.out.println(func1.getInfo());
								}
								else if(cod == 2)
								{
									System.out.println(func2.getInfo());							
								}
								else if(cod == 3)
								{
									System.out.println(func3.getInfo());
								}
								break;			
								
								
							default:
								System.out.println("\nSaindo do Sistema");
							}
							
						}while(op!=0);//condição de saída
						
					break;
						
						
						
						
				case 2:
					System.out.print("\nEscolha o que quer fazer: ");
					
					 do {
				            System.out.print("Menu:\n0-Sair\n1-Cadastro\n2-Login\n3-Atualização de Senha\n-->");
	
				            op = leia.nextInt();
	
				            switch (op) {
				                case 0:
				                    
				                    break;
	
				                case 1:
				                    System.out.print("Insira seu nome de usuário: ");
				                    String nome = leia.next();
	
				                    if (usuarios.containsKey(nome)) {
				                        System.out.println("\nEsse usuário já está cadastrado!\n");
				                        break;
				                    }
	
				                    System.out.print("Insira sua senha: ");
				                    String senha = leia.next();
	
				                    usuarios.put(nome, senha);
				                    System.out.println("\nUsuário cadastrado com sucesso.\n");
				                    break;
	
				                case 2:
				                    System.out.println("Insira seu nome de usuário: ");
				                    String nome2 = leia.next();
				                    System.out.println("Insira sua senha: ");
				                    String senha2 = leia.next();
	
				                    try {
				                        if (usuarios.get(nome2).equals(senha2))
				                            System.out.println("\nLogado com sucesso\n");
	
											// começa a funçao
				                        else
				                            System.out.println("\nSenha incorreta\n");
				                    } catch (NullPointerException e) {
				                        System.out.println("\nUsuário inválido\n");
				                    }
	
				                    break;
	
				                case 3:
				                    System.out.print("Insira seu nome de usuário: ");
				                    String nome3 = leia.next();
	
				                    if (!usuarios.containsKey(nome3)) {
				                        System.out.println("\nEsse usuário não está cadastrado!\n");
				                        break;
				                    }
	
				                    System.out.print("Insira sua senha atual: ");
				                    String senha3 = leia.next();
	
				                    if (!usuarios.get(nome3).equals(senha3)) {
				                        System.out.println("\nSenha incorreta!\n");
				                        break;
				                    }
	
				                    System.out.print("Insira sua nova senha: ");
				                    String novaSenha = leia.next();
	
				                    usuarios.put(nome3, novaSenha);
	
				                    break;
				                default:
				                    System.out.println("\nEscolha uma opção válida\n");
	
				            }
	
				        } while (op != 0);
	
				        System.out.println("Fim do Programa");
					
				
			}

	}

}
