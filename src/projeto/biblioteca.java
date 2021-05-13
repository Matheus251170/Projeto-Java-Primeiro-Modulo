package projeto;

import java.util.*;
public class biblioteca {

	public static void main(String[] args) {
		
		int op, cod;

		Scanner read = new Scanner(System.in);
		funcionario func1 = new funcionario("Celso", "alg@email.com", 25, 9898989, 1);
		funcionario func2 = new funcionario("cebola", "cebola@email.com", 23, 9898989, 2);
		funcionario func3 = new funcionario("Celsa", "alg@email.com", 22, 9898989, 3);
		
		funcionario[] func = new funcionario[3];
		
		
		System.out.println("Escolha uma opção: \n1. Entrar como funcionário.\n2. Entrar como cliente");
		op = read.nextInt();
		
		switch(op)
		{
			case 1:
				System.out.print("\nInsira seu código para entrar: ");
				cod = read.nextInt();
				 	
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
					
				break;
					
			case 2:
				System.out.print("\nEscolha o que quer fazer: ");
		}
		

		/*func[0] = func1;
		func[1] = func2;
		func[2] = func3;
		
		for(funcionario a:func)
		{
			System.out.println(a.getInfo());
		}*/

	}

}
