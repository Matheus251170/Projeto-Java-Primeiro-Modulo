package projeto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> usuarios = new HashMap<>();
        int opcao = 0; 

        do {
            System.out.print("Menu:\n0-Sair\n1-Cadastro\n2-Login\n3-Atualização de Senha\n--> ");

            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 0:
                    
                    break;

                case 1:
                    System.out.print("Insira seu nome de usuário: ");
                    String nome = scanner.next();

                    // verifica se o map já contem essa chave (se já contem o usuario cadstrado)
                    if (usuarios.containsKey(nome)) { 
                        System.out.println("\nEsse usuário já está cadastrado!\n");
                        break;
                    }

                    System.out.print("Insira sua senha: ");
                    String senha = scanner.next();

                    usuarios.put(nome, senha);
                    System.out.println("\nUsuário cadastrado com sucesso.\n");
                    break;

                case 2:
                    System.out.println("Insira seu nome de usuário: ");
                    String nome2 = scanner.next();
                    System.out.println("Insira sua senha: ");
                    String senha2 = scanner.next();

                    try {
                        // verifica se a senha(valor) do nome2(chave) é igual a senha informada pelo usuario
                        // nome2 = chave  --  senha2 = valor
                        if (usuarios.get(nome2).equals(senha2)) 
                            System.out.println("\nLogado com sucesso\n");
                        else
                            System.out.println("\nSenha incorreta\n");
                    } catch (NullPointerException e) {
                        System.out.println("\nUsuário inválido\n");
                    }

                    break;

                case 3:
                    System.out.print("Insira seu nome de usuário: ");
                    String nome3 = scanner.next();

                    // se o usuario não existir no map esse bloco de codigo será executado
                    if (!usuarios.containsKey(nome3)) {
                        System.out.println("\nEsse usuário não está cadastrado!\n");
                        break;
                    }

                    System.out.print("Insira sua senha atual: ");
                    String senha3 = scanner.next();

                    // se as senhas forem diferentes esse bloco de codigo é executado
                    // "!" serve pra inverter o valor - se "usuarios.get(nome3).equals(senha3))" for TRUE o "!" transforma em FALSE
                    if (!usuarios.get(nome3).equals(senha3)) {
                        System.out.println("\nSenha incorreta!\n");
                        break;
                    } 

                    System.out.print("Insira sua nova senha: ");
                    String novaSenha = scanner.next();

                    usuarios.put(nome3, novaSenha);

                    break;
                default:
                    System.out.println("\nEscolha uma opção válida\n");

            }

        } while (opcao != 0);

        System.out.println("Fim do Programa");
        
        scanner.close();
    }

}