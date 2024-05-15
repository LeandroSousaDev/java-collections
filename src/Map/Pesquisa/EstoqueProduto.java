package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
       estoqueProdutoMap.put(cod,  new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if(!estoqueProdutoMap.isEmpty()) {
            for(Produto p: estoqueProdutoMap.values()) {
                valorTotalEstoque += (p.getQuantidade() * p.getPreco());
            }
        } return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double valorTotalEstoque = 0;
        if(!estoqueProdutoMap.isEmpty()) {
            for ( Produto p : estoqueProdutoMap.values()) {
                double valorProdutoEstoque = (p.getPreco() * p.getQuantidade());
                if(valorProdutoEstoque > valorTotalEstoque) {
                   valorTotalEstoque = valorProdutoEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = p;
                }
            }
        } return produtoMaiorQuantidadeValorNoEstoque;
    }


}
