package br.com.cubosacademy.util.colletion;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {

    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add("Morango");
        lista.add("Abaxaxi");
        lista.add("Banana");
        lista.add("Laranja");
        // lista.remove(0);
        // lista.remove("Laranja");
        // lista.clear();
        // System.out.println(lista.get(1));

        System.out.println(lista.contains("Laranja"));
        System.out.println(lista.isEmpty());
        lista.set(1, "Uva");
        System.out.println(lista.size());

        System.out.println(lista);
    }

}
