import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro("", null, 0);

        System.out.println("Informe a Marca do Carro: ");
        carro1.setMarca(sc.nextLine());

        System.out.println("Informe o Modelo: ");
        carro1.setModelo(sc.nextLine());

        System.out.println("Informe o Ano da Fabricacão do Carro: ");
        carro1.setANO(sc.nextInt());

        System.out.println("A Marca do Carro é: "+carro1.getMarca());
        System.out.println("O Modelo do Carro é: "+carro1.getModelo());
        System.out.println("O Ano de Fabricação do Carro é: "+carro1.getANo());


        sc.close();

    }
}
