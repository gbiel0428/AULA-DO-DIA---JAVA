public class Clientecnpj extends Cliente{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override 
    public  void exibirdados(){
        super.exibirdados();
        System.out.println("CNPJ: "+cnpj);
    }
}
