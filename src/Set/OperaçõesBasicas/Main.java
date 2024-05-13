package Set.OperaçõesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidado.adicionarConvidado("Alice", 1234);
        conjuntoConvidado.adicionarConvidado("Bob", 1235);
        conjuntoConvidado.adicionarConvidado("Charlie", 1235);
        conjuntoConvidado.adicionarConvidado("David", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidado.exibirConvidados();

    }
}
