public class Cliente {
    
    private String nome;
    private String telefone;
    private String email;
    private String historico;

    // Construtor:
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historico = "";
    }

    // GETTERS:
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getHistorico() { return historico; }

    // SETTERS:
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }

    public void adicionarAoHistorico(String texto) {
        historico += texto + "\n";
    }
}
