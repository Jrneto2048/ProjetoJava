public class ClienteFisico extends Cliente{

    private int CPF;

    public ClienteFisico(){
        super();
    }
    public ClienteFisico(int codIdentificador, String nome, String endereco, int telefone, String tipo, int CPF){
        super(codIdentificador, nome, endereco, telefone, tipo);
        this.CPF = CPF;
    }
    public void setCPF(int CPF){

        this.CPF = CPF;
    }
    public int getCPF(){

        return this.CPF;
    }
}
