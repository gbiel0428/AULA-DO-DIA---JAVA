public class Carro {
    private String marca;
    private  String modelo;
    private  int anofabrica;

    public Carro(String marca, String modelo , int anofabrica){
        this.marca=marca;
        this.modelo=modelo;
        this.anofabrica=anofabrica;
    }

    public String getMarca(){
        return  marca;
    }

    public  String getModelo(){
        return  modelo;
    }

    public  int getANo(){
        return  anofabrica;
    }

    public  void setMarca(String marca){
        this.marca=marca;
    }

    public  void setModelo(String modelo){
        this.modelo=modelo;
    }

    public void setANO(int anofabrica){
        this.anofabrica=anofabrica;
    }


}
