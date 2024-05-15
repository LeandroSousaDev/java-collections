package Map.OperaçõesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("João", 5665);
        agendaContato.adicionarContato("Carlos", 1111111);
        agendaContato.adicionarContato("Ana", 654987);
        agendaContato.adicionarContato("Maria", 1111111);
        agendaContato.adicionarContato("Camila Dio", 44444);

        agendaContato.removerContato("Ana");

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("Camila"));
    }
}
