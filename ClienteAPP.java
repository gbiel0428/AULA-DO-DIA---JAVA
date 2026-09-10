import java.util.Scanner;

public class ClienteAPP {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("==== Sistema de Cadastro de Cliente ====");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Sair");
            System.out.print("Informe a Opção que Deseja Escolher: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção invalida. Informe 1, 2 ou 3");
                sc.next();
                System.out.print("Informe a Opção que Deseja Escolher: ");
            }

            op = sc.nextInt();
            sc.nextLine();

            while (op < 1 || op > 3) {
                System.out.println("Opção invalida. Informe 1, 2 ou 3");
                System.out.print("Informe a Opção que Deseja Escolher: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Opção invalida. Informe 1, 2 ou 3");
                    sc.next();
                    System.out.print("Informe a Opção que Deseja Escolher: ");
                }

                op = sc.nextInt();
                sc.nextLine();
            }

            switch (op) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("Informe o CPF: ");
                    String cpf = sc.nextLine();
                    
                    System.out.println("\nCliente cadastrado com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Endereço: " + endereco);
                    System.out.println("CPF: " + cpf);
                    break;


        } while (op != 3);

        sc.close();
    }
}
