package br.com.casadocodigo.bookstore.test;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.products.PhysicalBook;
import br.com.casadocodigo.bookstore.products.Ebook;
import br.com.casadocodigo.bookstore.products.Product;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortingWithJava {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");

        PhysicalBook book = new PhysicalBook(author);
        book.setName("Java 8 Prático");
        book.setValue(59.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Java 8 Prático");
        ebook.setValue(29.90);

        List<Product> products = Arrays.asList(book, ebook);
        Collections.sort(products);

        for(Product product : products) {
            System.out.println(product.getValue());
        }
        HashSet<String> set = new HashSet<String>();
        set.add("Não há repitição");
        set.add("Não há repitição");
        set.add("Não há repitição");
        set.add("Não há repitição");
        set.add("Não há repitição");
        System.out.println(set.size());
    }
}
