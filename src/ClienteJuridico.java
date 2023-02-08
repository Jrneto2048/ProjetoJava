public class ClienteJuridico extends Cliente{

    private int CNPJ;
    private int InscricaoEstadual;

    public ClienteJuridico(){
        super();
    }
    public ClienteJuridico(int codIdentificador, String nome, String endereco, int telefone, String tipo, int CNPJ, int numInscricaoEstadual){
        super(codIdentificador, nome, endereco, telefone, tipo);
        this.CNPJ = CNPJ;
        this.InscricaoEstadual = InscricaoEstadual;
    }
    public void setCNPJ(int CNPJ){

        this.CNPJ = CNPJ;
    }
    public int getCNPJ(){

        return this.CNPJ;
    }
    public void setNumInscricaoEstadual(int numInscricaoEstadual){

        this.InscricaoEstadual = numInscricaoEstadual;
    }
    public int getNumInscricaoEstadual(){

        return this.InscricaoEstadual;
    }
}
