import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        Scanner sc = new Scanner(System.in);

        Loja produto1 = new Loja(null, 0, 0);

        System.out.println("Informe o Nome do Produto: ");
        produto1.setnome(sc.nextLine());

        System.out.println("Informe o Preço do Produto: ");
        produto1.setpreco(sc.nextDouble());

        System.out.println("Informe a Quantidade do Produto: ");
        produto1.setquantidade(sc.nextInt());


        System.out.println("O Nome do Produto é: "+produto1.getNome());
        System.out.println("O Preço do Produto é R$: "+produto1.getpreco());
        System.out.println("A Quantidade de Produto é: "+produto1.getquantidade());
        System.out.println("PREÇO TOTAL R$: "+produto1.getpreco()*produto1.getquantidade());
        

    


        sc.close();
    }
}
