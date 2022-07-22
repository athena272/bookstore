package br.com.casadocodigo.bookstore.test;

import java.util.HashSet;

public class TestingPerformance {
    public static void main(String[] args) {

        HashSet<String> collection = new HashSet<String>();

        for (int i = 0; i < 1000000; i++) {
            collection.add("Item " + i);
        }

        long inicio = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            collection.contains("Item " + i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Demorou " + tempo + "ms para executar");
    }
}
