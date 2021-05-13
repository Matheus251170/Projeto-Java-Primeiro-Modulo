package Teste;


					import java.util.ArrayList;
					import java.util.Scanner;

					public class Estoque {

						public static void main(String[] args) {

							int op;
							
							Scanner leia = new Scanner(System.in);
							
							ArrayList<String> estoque = new ArrayList();
							
							do {
								System.out.println("\n---------------------");
								System.out.println("\n(1) Adicionar livros ao estoque");
								System.out.println("\n(2) Remover livros do estoque");
								System.out.println("\n(3) Atualizar livro");
								System.out.println("\n(4) Mostrar livros disponiveis");
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
									else {
										System.err.println("\nLivro n�o existe no estoque.");
									}
									break;
								
								case 3:
									leia.nextLine();//l� uma String para esvaziar o buffer de mem�ria (para n�o ficar sujeira na mem�ria
									System.out.println("\nMostrando os produtos do estoque:");
									System.out.println(estoque);
									break;
									
								default:
									System.out.println("\nSair do acervo");
								}
							}while(op!=0);//condi��o de sa�da
						}

					}
