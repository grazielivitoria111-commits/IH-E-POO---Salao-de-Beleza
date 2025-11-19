import java.util.ArrayList;
import java.util.List;

public class Profissional {

    private String nome;
    private String especialidade;
    private List<Agendamento> agendamentos;

    // Construtor:
    public Profissional(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.agendamentos = new ArrayList<>();
    }

    // GETTERS:
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

    // SETTERS:
    public void setEspecialidade(String e) { this.especialidade = e; }

    public void adicionarAgendamento(Agendamento ag) {
        agendamentos.add(ag);
    }

    public void listarAgendamentos() {
        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento para " + nome);
            return;
        }
        System.out.println("Agenda de " + nome + ":");
        for (Agendamento ag : agendamentos) {
            System.out.println("- " + ag.getData() + " às " + ag.getHorario() +
                    " | " + ag.getCliente().getNome() + " | " + ag.getServico().getNome());
        }
    }
}
