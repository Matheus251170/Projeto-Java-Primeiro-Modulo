	import java.util.ArrayList;
	import java.util.List;
	import java.util.*;


public class Categoria {



		public static void main(String[] args) {
			List<String> drama = new ArrayList<String>();
			int op;
			drama.add("O sol é para todos ");
			drama.add("Sociedade do cansaço");
			drama.add("Admiravel mundo novo");
			drama.add("Em busca de nos mesmo");
			
			Scanner leia = new Scanner(System.in);

			List<String> terror = new ArrayList<String>();
			
			terror.add("Dracula ");
			terror.add("It - A coisa");
			terror.add("O Exorcista");
			terror.add("O cemitério");
			
			
			do {
				System.out.println("\n------------MENU DE OPÇÕES-------------------");
				System.out.println("\n(1) Deseja ver livro de comedia ?");
				System.out.println("\n(2) Deseja ver livro de terror ?");
				System.out.println("\n(3) Deseja ?");
				System.out.println("\n(4) Deseja ?");
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

					System.out.println("\nDeseja atualizar...");
					System.out.println(drama);
					System.out.println(terror);
					break;

				case 4:

					System.out.println("\nDeseja ver todos os livros...");
					System.out.println(drama);
					System.out.println(terror);
					break;
				}

			} while (op != 0);
			System.out.println("\nFinalizou o programa...");

		}

	}

