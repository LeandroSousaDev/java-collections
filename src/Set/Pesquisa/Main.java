package Set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
        agendaContatos.adicionarContato("Carolina Dio", 44444444);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Ana"));

        agendaContatos.atualizarNumeroContato("Carolina", 54545454);

        agendaContatos.exibirContatos();

    }
}
