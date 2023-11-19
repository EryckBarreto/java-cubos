public class Main {
    public static void main(String[] args) {

    Aluno guido = new Aluno("Guido", "012345678900");
    Professor joao = new Professor("Odelio", "01234748978900", 360000);
    guido.calcularPontos(10);
    joao.calcularPontos(30);
    System.out.println(guido.getPontos());
    System.out.println(joao.getPontos());

        System.out.println(guido.imprimirSaudacao());
        System.out.println(joao.imprimirSaudacao());

    }
}