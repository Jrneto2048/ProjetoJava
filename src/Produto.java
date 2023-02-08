public class Produto{

    private int codigo;
    private String descricao;
    private String telefone;
    private int estoqueMinimo;
    private int quantAtual;
    private double valorDeCusto;
    private float percentualDeLucro;

    public Produto(){

    }
    public Produto(int codigo,String descricao,String telefone, int estoqueMinimo, int quantAtual, double valorDeCusto, float percentualDeLucro){
        this.codigo = codigo;
        this.descricao = descricao;
        this.telefone = telefone;
        this.estoqueMinimo = estoqueMinimo;
        this.quantAtual = quantAtual;
        this.valorDeCusto = valorDeCusto;
        this.percentualDeLucro = percentualDeLucro;
    }
    public void setCodigo(int codigo){

        this.codigo = codigo;
    }
    public int getCodigo(){

        return this.codigo;
    }
    public void setDescricao(String descricao){

        this.descricao = descricao;
    }
    public String getDescricao(){

        return this.descricao;
    }
    public void setTelefone(String telefone){

        this.telefone = telefone;
    }
    public String getTelefone(){

        return this.telefone;
    }
    public void setEstoqueMinimo(int estoqueMinimo){

        this.estoqueMinimo = estoqueMinimo;
    }
    public int getEstoqueMinimo(){

        return this.estoqueMinimo;
    }
    public void setQuantAtual(int quantAtual){

        this.quantAtual = quantAtual;
    }
    public int getQuantAtual(){

        return this.quantAtual;
    }
    public void setValorDeCusto(double valorDeCusto){

        this.valorDeCusto = valorDeCusto;
    }
    public double getValorDeCusto(){

        return this.valorDeCusto;
    }
    public void setPercentualDeLucro(float percentualDeLucro){

        this.percentualDeLucro = percentualDeLucro;
    }
    public float getPercentualDeLucro(){

        return this.percentualDeLucro;
    }
}
