package br.com.cubosacademy.util.colletion.list;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {

    public static void main(String[] args) {
//        List<String> lista = new ArrayList<String>();
//        lista.add("Morango");
//        lista.add("Abaxaxi");
//        lista.add("Banana");
//        lista.add("Laranja");
//        // lista.add(2);
//        // lista.remove(0);
//        // lista.remove("Laranja");
//        // lista.clear();
//        // System.out.println(lista.get(1));
//        System.out.println(lista.contains("Laranja"));
//        System.out.println(lista.isEmpty());
//        lista.set(1, "Uva");
//        System.out.println(lista.size());
//        System.out.println(lista);

        Pessoa guido = new Pessoa("Guido", 32);
        Pessoa joao = new Pessoa("Joao", 22);
        Pessoa maria = new Pessoa("Maria", 15);
        Pessoa ana = new Pessoa("Ana", 20);

        List<Pessoa> usuarios = new ArrayList<Pessoa>();

        usuarios.add(guido);
        usuarios.add(joao);
        usuarios.add(maria);
        usuarios.add(ana);

        System.out.println(usuarios);

        for (Pessoa usuario : usuarios) {
            System.out.println(usuario.getNome());
        }

    }

}
