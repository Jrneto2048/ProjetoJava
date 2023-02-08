public class Venda {

    private int dia;
    private int mes;
     private int quantVendida;
    private double meioDePagamento;
    private int valorDaVenda;
    private Cliente cliente;
    private Produto produto;

    public Venda() {
        this.cliente = new Cliente();
        this.produto = new Produto();
    }
    public Venda(int dia, int mes, int quantVendida, double meioDePagamento, int valorDaVenda, Cliente cliente, Produto produto) {
        this.dia = dia;
        this.mes = mes;
        this.quantVendida = quantVendida;
        this.meioDePagamento = meioDePagamento;
        this.valorDaVenda = valorDaVenda;
        this.cliente = cliente;
        this.produto = produto;
    }
    public void setDia(int dia) {

        this.dia = dia;
    }
    public int getDia() {

        return this.dia;
    }
    public void setMes(int mes) {

        this.mes = mes;
    }
    public int getMes() {

        return this.mes;
    }
    public void setQuantVendida(int quantVendida) {

        this.quantVendida = quantVendida;
    }
    public int getQuantVendida() {

        return this.quantVendida;
    }
    public void setMeioDePagamento(double meioDePagamento) {

        this.meioDePagamento = meioDePagamento;
    }
    public double getMeioDePagamento() {

        return this.meioDePagamento;
    }
    public void setValorDaVenda(int valorDaVenda) {

        this.valorDaVenda = valorDaVenda;
    }
    public int getValorDaVenda() {

        return this.valorDaVenda;
    }
    public void setCliente(Cliente cliente){

        this.cliente = cliente;
    }
    public Cliente getCliente(){

        return this.cliente;
    }
    public void setProduto(Produto produto){

        this.produto = produto;
    }
    public Produto getProduto(){

        return this.produto;
    }

}

