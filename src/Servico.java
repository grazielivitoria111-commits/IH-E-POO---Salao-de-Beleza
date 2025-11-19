public class Servico {

    private String nome;
    private double preco;
    private int duracao; // minutos

    // Construtor:
    public Servico(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    // GETTERS:
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getDuracao() { return duracao; }

    // SETTERS:
    public void setPreco(double preco) { this.preco = preco; }
    public void setDuracao(int duracao) { this.duracao = duracao; }
}
