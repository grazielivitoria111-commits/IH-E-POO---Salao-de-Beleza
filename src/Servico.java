public class Servico {
    private String nome;
    private double preco;
    private int duracao;

    public Servico(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getDuracao() { return duracao; }
}
