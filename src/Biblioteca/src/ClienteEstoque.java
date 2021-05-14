
import java.util.ArrayList;
import java.util.List;
import java.util.*;

	
	class ClienteEstoque {

		public static void main(String[] args) {
			List<String> drama = new ArrayList<String>();
			int op;
			
			drama.add("O sol é para todos ");
			drama.add("Sociedade do cansaço");
			drama.add("Admiravel mundo novo");
			drama.add("Em busca de nos mesmo");
			
			List<String> terror = new ArrayList<String>();
			
			terror.add("Dracula ");
			terror.add("It - A coisa");
			terror.add("O Exorcista");
			terror.add("O cemitério");
			

			List<String> comedia = new ArrayList<String>();
		
			comedia.add("A Troca ");
			comedia.add("Como ser mulher");
			comedia.add("A divina comedia");
			comedia.add("Minha vida não tão perfeita");
			
			List<String> romance = new ArrayList<String>();
			
			romance.add("O Duque e Eu ");
			romance.add("Anne of Green Gables");
			romance.add("A cinco passos de você");
			romance.add("Sol da meia-noite");
			
			Scanner leia = new Scanner(System.in);
			do {
				System.out.println("\n-------------------------------");
				System.out.println("\n(1) Deseja ver livros de terror ?");
				System.out.println("\n(2) Deseja ver livros de drama ?");
				System.out.println("\n(3) Deseja ver livros de comedia ?");
				System.out.println("\n(4) Deseja ver livros de romance ?");
				System.out.println("\n(5) Ver todas as categorias!");
				System.out.println("\n(0) Deseja encerrar o programa?");
				System.out.println("\nDigite sua opção: ");
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
					System.out.println("\nCOMÉDIA > "+comedia);
					System.out.println("\nROMANCE> "+romance);
				}

			} while (op != 0);
			System.out.println("\nFinalizou o programa...");

		}

	}


