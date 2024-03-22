import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        HashMap<String, Cliente> clientes = new HashMap<>(); 
        // HashMap para armazenar os clientes cadastrados

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n _      __ __  __  __  __  _  _     __    _     _      _  __ __  __ \r\n/ \\_/|/  _//  _\\/   _\\/  _ \\/  _ \\/ \\/ \\ /|/  _ \\  / \\ /\\/ \\  /|/ \\/    //  _ \\/  _\\\r\n| |\\/|||  \\  |  \\/||  /  | / \\|| | \\|| || |||| / \\|  | | ||| |\\ ||| ||  _\\| / \\||  \\/|\r\n| |  |||  /_ |    /|  \\_| |-||| |/|| || | ||| \\/|  | \\/|| | \\||| || |   | \\/||    /\r\n\\/  \\|\\_\\\\/\\\\\\_/\\/ \\|\\_/\\/\\/ \\|\\_/  \\_/\\/  \\|\\/\\/   \\_/\\/\\\\\r\n                                                                                        ");
            System.out.println("\nSEÇÃO - CLIENTES:");
            System.out.println("1. CADASTRAR CLIENTE");
            System.out.println("2. CONSULTAR TODOS OS CLIENTES CADASTRADOS");
            System.out.println("3. CONSULTAR POR CPF");
            System.out.println("0. SAIR");
            System.out.print("ESCOLHA UMA DAS OPÇÕES: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
        // Consumindo a quebra de linha após a leitura do inteiro

            switch (opcao) {
                case 1:
                    System.out.println();
                    cadastro.cadastrarCliente(clientes, scanner);
                    break;
                case 2:
                    System.out.println();
                    cadastro.mostrarClientes(clientes);
                    break;
                case 3:
                    System.out.print("INFORME O CPF QUE DESEJA PESQUISAR: ");
                    String cpf = scanner.nextLine();
                    cadastro.mostrarPorCPF(clientes, cpf);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    break;
                default:
                    System.out.println("OPCAO INVÁLIDA. SELECIONE UMA DAS OPCOES.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}