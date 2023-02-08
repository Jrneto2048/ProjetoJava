import java.util.ArrayList;
import java.util.List;

public class GerenciaVenda implements RelatorioVenda{

    private List<Venda> vendas;

    public GerenciaVenda(){

        this.vendas = new ArrayList<Venda>();
    }
    public GerenciaVenda(List<Venda> vendas){

        this.vendas = vendas;
    }
    public void setVendas(List<Venda> vendas){

        this.vendas = vendas;
    }
    public List<Venda> getVendas(){

        return this.vendas;
    }
    public void CadastrarVenda(Venda venda){

        this.vendas.add(venda);
    }
    public void RelatorioVendas(){
        for (int i = 0; i < this.vendas.size(); i++){
            System.out.println(this.vendas.get(i).getDia());
            System.out.println(this.vendas.get(i).getMes());
            System.out.println(this.vendas.get(i).getQuantVendida());
            System.out.println(this.vendas.get(i).getMeioDePagamento());
            System.out.println(this.vendas.get(i).getValorDaVenda());
            System.out.println(this.vendas.get(i).getCliente().getNome());
            System.out.println(this.vendas.get(i).getCliente().getEndereco());
            System.out.println(this.vendas.get(i).getCliente().getTipo());
            System.out.println(this.vendas.get(i).getCliente().getTelefone());
            System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
            System.out.println(this.vendas.get(i).getProduto().getCodigo());
            System.out.println(this.vendas.get(i).getProduto().getDescricao());
            System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
            System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
            System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
            System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
            System.out.println(this.vendas.get(i).getProduto().getValorVenda());
        }
    }
    public void RelatorioVendasMes(int mes) {
        for (int i = 0; i < this.vendas.size(); i++) {
            if (mes <= this.vendas.get(i).getMes()) {
                System.out.println(this.vendas.get(i).getDia());
                System.out.println(this.vendas.get(i).getMes());
                System.out.println(this.vendas.get(i).getQuantVendida());
                System.out.println(this.vendas.get(i).getMeioDePagamento());
                System.out.println(this.vendas.get(i).getValorDaVenda());
                System.out.println(this.vendas.get(i).getCliente().getNome());
                System.out.println(this.vendas.get(i).getCliente().getEndereco());
                System.out.println(this.vendas.get(i).getCliente().getTipo());
                System.out.println(this.vendas.get(i).getCliente().getTelefone());
                System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
                System.out.println(this.vendas.get(i).getProduto().getCodigo());
                System.out.println(this.vendas.get(i).getProduto().getDescricao());
                System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
                System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
                System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
                System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
                System.out.println(this.vendas.get(i).getProduto().getValorVenda());
            }
        }
    }
    public void RelatorioVendaFiado() {
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getMeioDePagamento() == 5) {
                System.out.println(this.vendas.get(i).getDia());
                System.out.println(this.vendas.get(i).getMes());
                System.out.println(this.vendas.get(i).getQuantVendida());
                System.out.println(this.vendas.get(i).getMeioDePagamento());
                System.out.println(this.vendas.get(i).getValorDaVenda());
                System.out.println(this.vendas.get(i).getCliente().getNome());
                System.out.println(this.vendas.get(i).getCliente().getEndereco());
                System.out.println(this.vendas.get(i).getCliente().getTipo());
                System.out.println(this.vendas.get(i).getCliente().getTelefone());
                System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
                System.out.println(this.vendas.get(i).getProduto().getCodigo());
                System.out.println(this.vendas.get(i).getProduto().getDescricao());
                System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
                System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
                System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
                System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
                System.out.println(this.vendas.get(i).getProduto().getValorVenda());
            }
        }
    }
    public void RelatorioVendaDinheio() {
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getMeioDePagamento() == 1) {
                System.out.println(this.vendas.get(i).getDia());
                System.out.println(this.vendas.get(i).getMes());
                System.out.println(this.vendas.get(i).getQuantVendida());
                System.out.println(this.vendas.get(i).getMeioDePagamento());
                System.out.println(this.vendas.get(i).getValorDaVenda());
                System.out.println(this.vendas.get(i).getCliente().getNome());
                System.out.println(this.vendas.get(i).getCliente().getEndereco());
                System.out.println(this.vendas.get(i).getCliente().getTipo());
                System.out.println(this.vendas.get(i).getCliente().getTelefone());
                System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
                System.out.println(this.vendas.get(i).getProduto().getCodigo());
                System.out.println(this.vendas.get(i).getProduto().getDescricao());
                System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
                System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
                System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
                System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
                System.out.println(this.vendas.get(i).getProduto().getValorVenda());
            }
        }
    }
    public void RelatoriosVendasNaoPagas() {
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getMeioDePagamento() == 0) {
                System.out.println(this.vendas.get(i).getDia());
                System.out.println(this.vendas.get(i).getMes());
                System.out.println(this.vendas.get(i).getQuantVendida());
                System.out.println(this.vendas.get(i).getMeioDePagamento());
                System.out.println(this.vendas.get(i).getValorDaVenda());
                System.out.println(this.vendas.get(i).getCliente().getNome());
                System.out.println(this.vendas.get(i).getCliente().getEndereco());
                System.out.println(this.vendas.get(i).getCliente().getTipo());
                System.out.println(this.vendas.get(i).getCliente().getTelefone());
                System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
                System.out.println(this.vendas.get(i).getProduto().getCodigo());
                System.out.println(this.vendas.get(i).getProduto().getDescricao());
                System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
                System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
                System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
                System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
                System.out.println(this.vendas.get(i).getProduto().getValorVenda());
            }
        }
    }
    public void BuscaVenda(Venda venda){
        for (int i = 0; i < this.vendas.size(); i++) {
            if (this.vendas.get(i).getCliente().getNome() == venda.getCliente().getNome()
                    && this.vendas.get(i).getDia() == venda.getDia()
                    && this.vendas.get(i).getProduto().getCodigo() == venda.getProduto().getCodigo()){
                System.out.println(this.vendas.get(i).getDia());
                System.out.println(this.vendas.get(i).getMes());
                System.out.println(this.vendas.get(i).getQuantVendida());
                System.out.println(this.vendas.get(i).getMeioDePagamento());
                System.out.println(this.vendas.get(i).getValorDaVenda());
                System.out.println(this.vendas.get(i).getCliente().getNome());
                System.out.println(this.vendas.get(i).getCliente().getEndereco());
                System.out.println(this.vendas.get(i).getCliente().getTipo());
                System.out.println(this.vendas.get(i).getCliente().getTelefone());
                System.out.println(this.vendas.get(i).getCliente().getCodIdentificador());
                System.out.println(this.vendas.get(i).getProduto().getCodigo());
                System.out.println(this.vendas.get(i).getProduto().getDescricao());
                System.out.println(this.vendas.get(i).getProduto().getEstoqueMinimo());
                System.out.println(this.vendas.get(i).getProduto().getQuantAtual());
                System.out.println(this.vendas.get(i).getProduto().getValorDeCusto());
                System.out.println(this.vendas.get(i).getProduto().getPercentualDeLucro());
                System.out.println(this.vendas.get(i).getProduto().getValorVenda());
            }
        }
    }
}
