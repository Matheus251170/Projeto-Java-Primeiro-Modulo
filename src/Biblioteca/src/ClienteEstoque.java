import java.util.ArrayList;
import java.util.List;
import java.util.*;

class ClienteEstoque {

	public static void main(String[] args) {
		List<String> categoria = new ArrayList<String>();
		int op;
		categoria.add("A menina que roubava livro ");
		categoria.add("Do mil ao milhão");
		categoria.add("Cronicas de Narnia");
		categoria.add("Espelho Espelho meu");
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\n-------------------------------");
			System.out.println("\n(1) Deseja ver livro de comedia ?");
			System.out.println("\n(2) Deseja remover este livro ?");
			System.out.println("\n(3) Atualizar lista de livro ?");
			System.out.println("\n(4) Mostrar todos os livros ?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			switch (op) {

			case 1:

				System.out.println("\nMostrando os livros categoria comedia ...");
				System.out.println(categoria);
				break;

			case 2:

				System.out.println("\nMostrando os livros categoria drama ...");
				System.out.println(categoria);
				break;

			case 3:

				System.out.println("\nDeseja atualizar...");
				System.out.println(categoria);
				break;

			case 4:

				System.out.println("\nDeseja ver todos os livros...");
				System.out.println(categoria);
				break;
			}

		} while (op != 0);
		System.out.println("\nFinalizou o programa...");

	}

}
