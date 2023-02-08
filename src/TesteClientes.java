import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TesteClientes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciaVenda gerenciaVenda = new GerenciaVenda();
        Venda venda = new Venda();
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        int opcao;

        do {
            System.out.println("Gerenciamento dos produtos");
            System.out.println();
            System.out.println("1- Cadastre a venda");
            System.out.println();
            System.out.println("2- Buscar venda realizada");
            System.out.println();
            System.out.println("3- Apresentar o relatório de vendas");
            System.out.println();
            System.out.println("4- Apresentar o relatório de vendas a partir de um mês informado pelo cliente");
            System.out.println();
            System.out.println("5- Apresentar o relatório de vendas como meio de pagamento fiado");
            System.out.println();
            System.out.println("6- Apresentar o relatório de vendas como meio de pagamento dinheiro");
            System.out.println();
            System.out.println("7- Apresentar o relatório de vendas que ainda não foram pagas");
            System.out.println();
            System.out.println("8- Sair do pograma");
            System.out.println();
            System.out.println("Informe uma opção do menu: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Cadastar o dia da venda");
                    venda.setDia(teclado.nextInt());
                    System.out.println("Cadastar o mês da venda");
                    venda.setMes(teclado.nextInt());
                    System.out.println("Cadastar a quantidade vendida");
                    venda.setQuantVendida(teclado.nextInt());
                    System.out.println("Cadastar o meio de pagamento");
                    venda.setMeioDePagamento(teclado.nextDouble());
                    System.out.println("Cadastar o valor da venda");
                    venda.setValorDaVenda(teclado.nextInt());
                    System.out.println("Cadastar o cliente");
                    System.out.println("CPF: ");
                    cliente.setCodIdentificador(teclado.nextInt());
                    System.out.println("nome: ");
                    cliente.setNome(teclado.next());
                    System.out.println("Endereço: ");
                    cliente.setEndereco(teclado.next());
                    System.out.println("Telefone: ");
                    cliente.setTelefone(teclado.nextInt());
                    System.out.println("Tipo: ");
                    cliente.setTipo(teclado.next());
                    venda.setCliente(cliente);
                    System.out.println("Cadastar o produto");
                    System.out.println("Codigo: ");
                    produto.setCodigo(teclado.nextInt());
                    System.out.println("Descrição: ");
                    produto.setDescricao(teclado.next());
                    System.out.println("Estoque minimo: ");
                    produto.setEstoqueMinimo(teclado.nextInt());
                    System.out.println("Quantidade atual: ");
                    produto.setQuantAtual(teclado.nextInt());
                    System.out.println("Valor de custo: ");
                    produto.setValorDeCusto(teclado.nextDouble());
                    System.out.println("Percentual de lucro: ");
                    produto.setPercentualDeLucro(teclado.nextFloat());
                    venda.setProduto(produto);
                    gerenciaVenda.CadastrarVenda(venda);

                    break;

                case 2:

                    System.out.println("Digite o nome do cliente: ");
                    venda.getCliente().setNome(teclado.next());
                    System.out.println();
                    System.out.println("Digite o dia da venda: ");
                    venda.setDia(teclado.nextInt());
                    System.out.println();
                    System.out.println("Informe o id do produto vendido: ");
                    venda.getProduto().setCodigo(teclado.nextInt());




                    break;

                case 3:

                    gerenciaVenda.RelatorioVendas();

                    break;

                case 4:

                    System.out.println("Informe um mês: ");
                    gerenciaVenda.RelatorioVendasMes(teclado.nextInt());

                    break;

                case 5:

                    gerenciaVenda.RelatorioVendaFiado();

                    break;

                case 6:

                    gerenciaVenda.RelatorioVendaDinheio();

                    break;

                case 7:

                    gerenciaVenda.RelatoriosVendasNaoPagas();

                    break;
            }

        }
        while (opcao != 8);
    }
}
