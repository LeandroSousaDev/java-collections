package Set.Ordenação;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProduto.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProduto.adicionarProduto(3L, "Mouse", 30d, 20);
        cadastroProduto.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}
