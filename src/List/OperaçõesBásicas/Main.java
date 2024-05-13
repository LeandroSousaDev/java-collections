package List.OperaçõesBásicas;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionaTarefa("tarefa 1");
        listaTarefa.adicionaTarefa("tarefa 2");
        listaTarefa.adicionaTarefa("tarefa 3");
        listaTarefa.adicionaTarefa("tarefa 4");

        System.out.println("Total tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("tarefa 3");
        System.out.println("Total tarefas: " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesDeTarefas();

    }
}
