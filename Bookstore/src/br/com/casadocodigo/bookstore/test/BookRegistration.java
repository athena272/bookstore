package br.com.casadocodigo.bookstore.test;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.products.PhysicalBook;

public class BookRegistration {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");
        author.setEmail("rodrigo@gmail.com");
        author.setCpf("XXX.XXX.XXX.XX");

        Author otherAuthor = new Author();
        otherAuthor.setName("Paulo Silveira");
        otherAuthor.setEmail("paulo@gmail.com");
        otherAuthor.setCpf("YYY.YYY.YYY.YY");

        PhysicalBook book = new PhysicalBook(author);
        book.setName("Java 8 Prático");
        book.setDescription("Novos recursos da linguagem");
        book.setValue(59.90);
        book.setIsbn("978-85-66250-46-6");

        book.showDetails();

        PhysicalBook otherBook = new PhysicalBook(otherAuthor);
        otherBook.setName("Lógica de Programação");
        otherBook.setDescription("Crie seus primeiros programas");
        otherBook.setValue(59.90);
        otherBook.setIsbn("978-85-66250-22-0");

        otherAuthor.showDetails();

    }
}
