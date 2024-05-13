package List.OperaçõesBásicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void  removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for(Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesDeTarefas() {
        System.out.println(tarefaList);
    }


}
