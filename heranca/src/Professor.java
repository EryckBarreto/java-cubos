public class Professor extends Pessoa {
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
}
