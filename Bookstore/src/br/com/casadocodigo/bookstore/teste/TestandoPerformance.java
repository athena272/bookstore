package br.com.casadocodigo.bookstore.teste;

import java.util.HashSet;

public class TestandoPerformance {
    public static void main(String[] args) {

        HashSet<String> colecao = new HashSet<String>();

        for (int i = 0; i < 1000000; i++) {
            colecao.add("Item " + i);
        }

        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            colecao.contains("Item " + i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Demorou " + tempo + "ms para executar");
    }
}