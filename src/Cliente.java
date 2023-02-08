public class Cliente {

    private int codIdentificador;
    private String nome = null;
    private String endereco;
    private int telefone;
    private String tipo;

    public Cliente(){

    }
    public Cliente(int codIdentificador, String nome, String endereco, int telefone, String tipo){
        this.codIdentificador = codIdentificador;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo = tipo;
    }
    public void setCodIdentificador(int codIdentificador){

        this.codIdentificador = codIdentificador;
    }
    public int getCodIdentificador(){

        return this.codIdentificador;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
    public String getNome(){

        return this.nome;
    }
    public void setEndereco(String endereco){

        this.endereco = endereco;
    }
    public String getEndereco(){

        return this.endereco;
    }
    public void setTelefone(int telefone){

        this.telefone = telefone;
    }
    public int getTelefone(){

        return this.telefone;
    }
    public void setTipo(String tipo){

        this.tipo = tipo;
    }
    public String getTipo(){

        return this.tipo;
    }
}
