public class PessoaApp {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "gabriel");
        Pessoa p2 = new Pessoa(2,  "Ana");
        Pessoa p3 = new  Pessoa(3, "joao");

        //Acessar
        System.out.println("Pessoa: " +p1.getCodigo()+ "| Nome: "+p1.getNome());
        System.out.println("Pessoa: " +p2.getCodigo()+ "| Nome: "+p2.getNome());
        System.out.println("Pessoa: " +p3.getCodigo()+ "| Nome: "+p3.getNome());
        
        
        // Modificar
        p3.setNome("Vanessa");
        System.out.println("Pessoa: " +p1.getCodigo()+ "| Nome: "+p1.getNome());
        System.out.println("Pessoa: " +p2.getCodigo()+ "| Nome: "+p2.getNome());
        System.out.println("Pessoa: " +p3.getCodigo()+ "| Nome: "+p3.getNome());

    }
}