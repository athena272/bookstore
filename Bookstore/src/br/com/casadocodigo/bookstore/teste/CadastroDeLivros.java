package br.com.casadocodigo.bookstore.teste;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.products.PhysicalBook;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Rodrigo Turini");
        author.setEmail("rodrigo@gmail.com");
        author.setCpf("XXX.XXX.XXX.XX");

        Author outroAuthor = new Author();
        outroAuthor.setName("Paulo Silveira");
        outroAuthor.setEmail("paulo@gmail.com");
        outroAuthor.setCpf("YYY.YYY.YYY.YY");

        PhysicalBook livro = new PhysicalBook(author);
        livro.setName("Java 8 Prático");
        livro.setDescription("Novos recursos da linguagem");
        livro.setValue(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.showDetails();

        PhysicalBook outroLivro = new PhysicalBook(outroAuthor);
        outroLivro.setName("Lógica de Programação");
        outroLivro.setDescription("Crie seus primeiros programas");
        outroLivro.setValue(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.showDetails();

    }
}
