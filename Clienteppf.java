
public class Clienteppf  extends  Cliente{
    private  String cpf;

    public  Clienteppf(String nome , String endereco, String cpf){
        super(nome , endereco);
        this.cpf=cpf;
    }

    public String getCPF(){
        return  cpf;
    }

    public  void setCPF(String cpf){
        this.cpf=cpf;
    }
    @Override
    public void exibirdados(){
        super.exibirdados();
        System.out.println("CPF: "+cpf);
    }
}
