import java.util.ArrayList;
import java.util.List;

public class Profissional {
    private String nome;
    private String especialidade;
    private List<Agendamento> agendamentos;

    public Profissional(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.agendamentos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

    public void adicionarAgendamento(Agendamento ag) {
        agendamentos.add(ag);
    }
}
