package br.com.casadocodigo.bookstore;

import br.com.casadocodigo.bookstore.products.Ebook;
import br.com.casadocodigo.bookstore.products.Product;

public class Program {
    public static void main(String[] args) {
        Author author1 = new Author();
        Ebook ebook = new Ebook(author1);
        System.out.println(ebook.getAuthor());

    }
}
