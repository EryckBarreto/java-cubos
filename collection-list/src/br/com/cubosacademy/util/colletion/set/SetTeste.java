package br.com.cubosacademy.util.colletion.set;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        nomes.add("Guido");
        nomes.add("João");
        nomes.add("João");
        System.out.println(nomes);
    }

}
