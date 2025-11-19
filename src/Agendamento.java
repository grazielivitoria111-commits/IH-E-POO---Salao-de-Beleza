public class Agendamento {

    private Cliente cliente;
    private Servico servico;
    private Profissional profissional;
    private String data;
    private String horario;
    private boolean confirmado;

    // Construtor:
    public Agendamento(Cliente cliente, Servico servico,
                       Profissional profissional, String data, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.profissional = profissional;
        this.data = data;
        this.horario = horario;
        this.confirmado = false;
    }

    // GETTERS:
    public Cliente getCliente() { return cliente; }
    public Servico getServico() { return servico; }
    public Profissional getProfissional() { return profissional; }
    public String getData() { return data; }
    public String getHorario() { return horario; }

    // SETTERS:
    public void setData(String novaData) { this.data = novaData; }
    public void setHorario(String novoHorario) { this.horario = novoHorario; }

    public void confirmar() {
        this.confirmado = true;
        cliente.adicionarAoHistorico(
                "Serviço: " + servico.getNome() +
                " com " + profissional.getNome() +
                " em " + data + " às " + horario);
    }
}
