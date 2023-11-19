public class Professor extends Pessoa implements Usuario {
    private int salario;
    public Professor(String nome, String cpf, int salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String imprimirSaudacao() {
        return "Olá professor: " + this.getNome();
    }

    public void calcularPontos(int minutosDeLeitura) {
        int pontos = minutosDeLeitura * 3;
        this.setPontos(pontos);
    }


}
