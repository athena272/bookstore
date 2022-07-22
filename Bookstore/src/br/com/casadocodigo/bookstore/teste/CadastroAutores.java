package br.com.casadocodigo.bookstore.teste;

import br.com.casadocodigo.bookstore.Author;

public class CadastroAutores {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");

        Author outroAuthor = new Author();
        outroAuthor.setName("Rodrigo Turini");

        if(author.equals(outroAuthor)) {
            System.out.println("Igual");
        }
        else {
            System.out.println("Diferente");
        }
    }
}
