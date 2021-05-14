package Teste;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;



public class Categoria {



		public static void main(String[] args) {
			List<String> drama = new ArrayList<String>();
			int op;
			drama.add("O sol � para todos ");
			drama.add("Sociedade do cansa�o");
			drama.add("Admiravel mundo novo");
			drama.add("Em busca de n�s mesmo");
			
			Scanner leia = new Scanner(System.in);

			List<String> terror = new ArrayList<String>();
			
			terror.add("Dracula");
			terror.add("It - A coisa");
			terror.add("O Exorcista");
			terror.add("O cemit�rio");
			
			List<String> comedia = new ArrayList<String>();
			
			comedia.add("A Troca ");
			comedia.add("Como ser mulher");
			comedia.add("A divina comedia");
			comedia.add("Minha vida n�o t�o perfeita");
			
			List<String> romance = new ArrayList<String>();
			
			romance.add("O Duque e Eu ");
			romance.add("Anne of Green Gables");
			romance.add("A cinco passos de voc�");
			romance.add("Sol da meia-noite");
			
			List<String> ficcao = new ArrayList<String>();
			
			ficcao.add("I, Robot");
			ficcao.add("Duna");
			ficcao.add("A guerra dos mundos");
			ficcao.add("O Senhor dos An�is");
			
			List<String> aventura = new ArrayList<String>();
			
			aventura.add("Alice no pais das maravilhas");
			aventura.add("A volta ao mundo em 80 dias");
			aventura.add("A Rainha Vermelha");
			aventura.add("O C�digo Da Vinci");
			
			List<String> acao = new ArrayList<String>();
			
			acao.add("Cidade dos Ossos");
			acao.add("As Minas de Salom�o");
			acao.add("Jogos Vorazes");
			acao.add("Anjos e Demonios");
			
			
			List<String> best = new ArrayList<String>();
			
			best.add("Fahrenheit 451");
			best.add("Mindset: A nova psicologia do sucesso");
			best.add("O cavaleiro preso na armadura");
			best.add("Ars�ne Lupin: O Ladr�o de Casaca");
			
			
			do {
				System.out.println("\n------------MENU DE OP��ES-------------------");
				System.out.println("\n(1) Deseja ver livro de terror?");
				System.out.println("\n(2) Deseja ver livro de drama?");
				System.out.println("\n(3) Deseja ver livros de comedia?");
				System.out.println("\n(4) Deseja ver livros de romance?");
				System.out.println("\n(5) Deseja ver livros de fic��o?");
				System.out.println("\n(6) Deseja ver livros de aventura?");
				System.out.println("\n(7) Deseja ver livros de a��o?");
				System.out.println("\n(8) Deseja ver os Best Sellers?");
				System.out.println("\n(9) Ver todas as categorias!");
				System.out.println("\n(0) Deseja encerrar o programa?");
				System.out.println("\nDigite sua op��o: ");
				op = leia.nextInt();
				switch (op) {

				case 1:
					
					System.out.println("\nMostrando os livros de drama ...");
					System.out.println(drama);
					break;

				case 2:

					System.out.println("\nMostrando os livros de terror ...");
					System.out.println(terror);
					break;

				case 3:

					System.out.println("\nMostrando os livros de com�dia...");
					System.out.println(comedia);
					
					break;

				case 4:

					System.out.println("\nMostrando os livros de romance...");
					System.out.println(romance);
					break;
					
				case 5:

					System.out.println("\nMostrando os livros de fic��o...");
					System.out.println(ficcao);
					break;
					
				case 6:

					System.out.println("\nMostrando os livros de aventura...");
					System.out.println(aventura);
					break;
					
					
				case 7:

					System.out.println("\nMostrando os livros de a��o...");
					System.out.println(acao);
					break;
					
				case 8:

					System.out.println("\nMostrando os Best Sellers...");
					System.out.println(best);
					break;
					
				case 9:
					
					System.out.println("CATEGORIAS:");
					System.out.println("\nDRAMA > "+drama);
					System.out.println("\nTERROR > "+terror);
					System.out.println("\nCOM�DIA > "+comedia);
					System.out.println("\nROMANCE > "+romance);
					System.out.println("\nFICCAO > "+ficcao);
					System.out.println("\nAVENTURA > "+aventura);
					System.out.println("\nACAO > "+acao);
					System.out.println("\nBEST SELLER > "+best);
					
				}

			} while (op != 0);
			System.out.println("\nFinalizou o programa...");

		}

	}


