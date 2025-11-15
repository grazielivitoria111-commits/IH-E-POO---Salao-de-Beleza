public class Agendamento {
    private Cliente cliente;
    private Servico servico;
    private Profissional profissional;
    private String data;
    private String horario;

    public Agendamento(Cliente cliente, Servico servico,
                       Profissional profissional, String data, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.profissional = profissional;
        this.data = data;
       	this.horario = horario;
    }

    public Cliente getCliente() { return cliente; }
    public Servico getServico() { return servico; }
    public Profissional getProfissional() { return profissional; }
    public String getData() { return data; }
    public String getHorario() { return horario; }
}
