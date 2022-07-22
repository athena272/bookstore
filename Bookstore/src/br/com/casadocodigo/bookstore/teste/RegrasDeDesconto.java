package br.com.casadocodigo.bookstore.teste;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.products.Book;
import br.com.casadocodigo.bookstore.products.Ebook;
import br.com.casadocodigo.bookstore.products.MiniBook;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");

        Book book = new MiniBook(author);
        book.setValue(39.90);

        /*
        if(!book.aplicaDescontoDe(0.3)){
            System.out.println("Desconto não pode ser maior que 30%");
        }
        else {
            System.out.println("Valor com desconto: " + book.getValue());
        }

         */

        Ebook ebook = new Ebook(author);
        ebook.setValue(29.90);

        if(!ebook.aplyDiscount(0.15)){
            System.out.println("Desconto não pode ser maior que 15%");
        }
        else {
            System.out.println("Valor com desconto: " + ebook.getValue());
        }


    }
}
