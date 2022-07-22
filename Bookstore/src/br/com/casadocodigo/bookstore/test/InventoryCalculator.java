package br.com.casadocodigo.bookstore.test;

public class InventoryCalculator {
    public static void main(String[] args) {
        double bookJava8 = 60;
        double bookTDD = 60;

        int numberInt = (int) bookJava8;

        double sum = bookTDD + bookJava8;
        System.out.println(sum);
        System.out.println(numberInt);
    }
}
