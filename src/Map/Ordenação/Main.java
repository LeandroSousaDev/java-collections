package Map.Ordenação;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaDeEvento agendaDeEvento = new AgendaDeEvento();

        agendaDeEvento.adicionarEvento(LocalDate.of(2022, 7, 15), "Evento 1", "Atração 1");
        agendaDeEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 9), "Evento 2", "Atração 2");
        agendaDeEvento.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 3", "Atração 3");
        agendaDeEvento.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 28), "Evento 4", "Atração 4");
        agendaDeEvento.adicionarEvento(LocalDate.of(2021, 6, 20), "Evento 5", "Atração 5");

        agendaDeEvento.exibirAgenda();

        agendaDeEvento.obterProximoEvento();
    }
}
