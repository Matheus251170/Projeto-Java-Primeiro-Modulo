package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class biblioteca {

	public static void main(String[] args) {
		
		int op, cod, cont = 0;

		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		Map<String, String> usuarios = new HashMap<>();
		List<String> drama = new ArrayList<String>();
		
	
		
		funcionario func1 = new funcionario("Celso", "alg@email.com", 25, 9898989, 1);
		funcionario func2 = new funcionario("cebola", "cebola@email.com", 23, 9898989, 2);
		funcionario func3 = new funcionario("Celsa", "alg@email.com", 22, 9898989, 3);
		
		funcionario[] func = new funcionario[3];
		
		drama.add("O sol � para todos");
		drama.add("Sociedade do cansa�o");
		drama.add("Admiravel mundo novo");
		drama.add("Em busca de nos mesmo");
		
		List<String> terror = new ArrayList<String>();
		
		terror.add("Dracula");
		terror.add("It - A coisa");
		terror.add("O Exorcista");
		terror.add("O cemit�rio");
		

		List<String> comedia = new ArrayList<String>();
	
		comedia.add("A Troca");
		comedia.add("Como ser mulher");
		comedia.add("A divina comedia");
		comedia.add("Minha vida n�o t�o perfeita");
		
		List<String> romance = new ArrayList<String>();
		
		romance.add("O Duque e Eu");
		romance.add("Anne of Green Gables");
		romance.add("A cinco passos de voc�");
		romance.add("Sol da meia-noite");
		
			
		
			System.out.println("Escolha uma op��o: \n1. Entrar como funcion�rio.\n2. Entrar como cliente");
			op = leia.nextInt();
			

			switch(op)
			{
				case 1:
					System.out.print("\nInsira seu c�digo para entrar: ");
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
							System.out.println("C�digo inv�lido!");
						}
						
						do {
							System.out.println("\n---------------------");
							System.out.println("\n(1) Adicionar livros ao estoque");
							System.out.println("\n(2) Remover livros do estoque");
							System.out.println("\n(3) Mostrar livros disponiveis");
							System.out.println("\n(4) Visualizar informa��es de funcion�rio");
							System.out.println("\n(0) Sair do estoque");
							System.out.println("\n Digite sua op��o: ");
							op = leia.nextInt();
							
							switch(op) {
							case 1:
								leia.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
								System.out.println("\nDigite o nome do livro que deseja adicionar ao estoque: ");
								String produto = leia.nextLine();
								estoque.add(produto);
								break;
								
							case 2:
								leia.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
								System.out.println("\nDigite o nome do livro que deseja retirar do estoque: ");
								String produto1 = leia.nextLine();
								if(estoque.contains(produto1)) {
									estoque.remove(produto1);
								}
								else if(comedia.contains(produto1))
								{
									comedia.remove(produto1);
								}
								else if(terror.contains(produto1))
								{
									terror.remove(produto1);
								}
								else if(drama.contains(produto1))
								{
									drama.remove(produto1);
								}
								else if(romance.contains(produto1))
								{
									romance.remove(produto1);
								}
								else {
									System.err.println("\nLivro n�o existe no estoque.");
								}
								break;
							
							case 3:
								leia.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
								System.out.println("\nMostrando os produtos do estoque:");
								System.out.println(estoque);
								System.out.println(drama);
								System.out.println(terror);
								System.out.println(comedia);
								System.out.println(romance);
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
							
						}while(op!=0);//condi��o de sa�da
						
					break;
						
						
						
						
				case 2:
					System.out.print("\nEscolha o que quer fazer: ");
					
					 do {
				            System.out.print("Menu:\n0-Sair\n1-Cadastro\n2-Login\n3-Atualiza��o de Senha\n-->");
	
				            op = leia.nextInt();
	
				            switch (op) {
				                case 0:
				                    
				                    break;
	
				                case 1:
				                    System.out.print("Insira seu nome de usu�rio: ");
				                    String nome = leia.next();
	
				                    if (usuarios.containsKey(nome)) {
				                        System.out.println("\nEsse usu�rio j� est� cadastrado!\n");
				                        break;
				                    }
	
				                    System.out.print("Insira sua senha: ");
				                    String senha = leia.next();
	
				                    usuarios.put(nome, senha);
				                    System.out.println("\nUsu�rio cadastrado com sucesso.\n");
				                    break;
	
				                case 2:
				                    System.out.println("Insira seu nome de usu�rio: ");
				                    String nome2 = leia.next();
				                    System.out.println("Insira sua senha: ");
				                    String senha2 = leia.next();
	
				                    try {
				                        if (usuarios.get(nome2).equals(senha2))
				                        {    System.out.println("\nLogado com sucesso\n");
				                        
				                        do {
				            				System.out.println("\n-------------------------------");
				            				System.out.println("\n(1) Deseja ver livros de terror ?");
				            				System.out.println("\n(2) Deseja ver livros de drama ?");
				            				System.out.println("\n(3) Deseja ver livros de comedia ?");
				            				System.out.println("\n(4) Deseja ver livros de romance ?");
				            				System.out.println("\n(5) Ver todas as categorias!");
				            				System.out.println("\n(0) Deseja encerrar o programa?");
				            				System.out.println("\nDigite sua op��o: ");
				            				op = leia.nextInt();
				            				
				            				switch (op) {

				            				case 1:

				            					System.out.println("\nMostrando os livros categoria drama ...");
				            					System.out.println(drama);
				            					break;

				            				case 2:

				            					System.out.println("\nMostrando os livros categoria terror ...");
				            					System.out.println(terror);
				            					break;

				            				case 3:

				            					System.out.println("\nMostrando livros de comedia...");
				            					System.out.println(comedia);
				            					break;

				            				case 4:

				            					System.out.println("\nMostrando livros de romance ...");
				            					System.out.println(romance);
				            					break;
				            					
				            				case 5:

				            					System.out.println("CATEGORIAS:");
				            					System.out.println("\nDRAMA > "+drama);
				            					System.out.println("\nTERROR > "+terror);
				            					System.out.println("\nCOM�DIA > "+comedia);
				            					System.out.println("\nROMANCE> "+romance);
				            				}

				            			} while (op != 0);
				                        
				                        }
				                        // come�a a fun�ao
				                        else
				                            System.out.println("\nSenha incorreta\n");
				                    } catch (NullPointerException e) {
				                        System.out.println("\nUsu�rio inv�lido\n");
				                    }
	
				                    break;
	
				                case 3:
				                    System.out.print("Insira seu nome de usu�rio: ");
				                    String nome3 = leia.next();
	
				                    if (!usuarios.containsKey(nome3)) {
				                        System.out.println("\nEsse usu�rio n�o est� cadastrado!\n");
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
				                    System.out.println("\nEscolha uma op��o v�lida\n");
	
				            }
	
				        } while (op != 0);
					 
			
	
				        System.out.println("Fim do Programa");
					
				
			}

	}

}
