public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String historico;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historico = "";
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getHistorico() { return historico; }

    public void adicionarAoHistorico(String texto) {
        historico += texto + "\n";
    }
}
