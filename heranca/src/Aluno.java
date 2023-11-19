public class Aluno extends Pessoa{
    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void calcularPontos(int minutosDeLeitura) {
        int pontos = minutosDeLeitura * 2;
        this.setPontos(pontos);
    }

    public String imprimirSaudacao() {
        return "Olá aluno(a): " + this.getNome();
    }

}

