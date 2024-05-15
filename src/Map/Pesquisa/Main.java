package Map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.exibirProdutos();
//
        estoqueProduto.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoqueProduto.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoqueProduto.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoqueProduto.adicionarProduto(4L, "Teclado", 2, 40.0);

//        estoqueProduto.adicionarProduto(5L, "Produto A", 10, 5.0);
//        estoqueProduto.adicionarProduto(6L, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProduto(7L, "Produto C", 1, 15.0);

        estoqueProduto.exibirProdutos();

        System.out.println(estoqueProduto.calcularValorTotalEstoque());
        System.out.println(estoqueProduto.obterProdutoMaisCaro());
        System.out.println(estoqueProduto.obterProdutoMaisBarato());
        System.out.println(estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
