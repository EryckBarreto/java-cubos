public abstract class Pessoa {

    private String nome;

    private String cpf;

    private int pontos;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public String imprimirSaudacao() {
        return "Olá pessoa: " + this.nome;
    }

    public abstract void calcularPontos(int minutosDeLeitura);

}
