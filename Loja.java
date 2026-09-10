public class Loja {
    private String nome;
    private  double preco;
    private int quantidade;


    public Loja(String nome , double preco , int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public String getNome(){
        return  nome;
    }

    public  double getpreco(){
        return preco;
    }

    public  int getquantidade(){
        return quantidade;
    }

    public void setnome(String nome){
        this.nome=nome;
    }
    
    public  void setpreco(double preco){
        this.preco=preco;
    }

    public  void setquantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
