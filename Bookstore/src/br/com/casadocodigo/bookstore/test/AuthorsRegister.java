package br.com.casadocodigo.bookstore.test;

import br.com.casadocodigo.bookstore.Author;

public class AuthorsRegister {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");

        Author otherAuthor = new Author();
        otherAuthor.setName("Rodrigo Turini");

        if(author.equals(otherAuthor)) {
            System.out.println("Igual");
        }
        else {
            System.out.println("Diferente");
        }
    }
}
