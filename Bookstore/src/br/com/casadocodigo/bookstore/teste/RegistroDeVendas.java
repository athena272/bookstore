package br.com.casadocodigo.bookstore.teste;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.ShoppingCart;
import br.com.casadocodigo.bookstore.products.Ebook;
import br.com.casadocodigo.bookstore.products.PhysicalBook;
import br.com.casadocodigo.bookstore.products.Product;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Mauricio Aniche");

        PhysicalBook livroFisico = new PhysicalBook(author);
        livroFisico.setName("Test-Driven Development");
        livroFisico.setValue(59.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");
        ebook.setValue(29.90);

        if(livroFisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + livroFisico.getValue());
        }

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.adiciona(livroFisico);
        shoppingCart.adiciona(ebook);
        System.out.println("Total: " + shoppingCart.getTotal());

        List<Product> products = shoppingCart.getProdutos();
        for(Product product : products) {
            System.out.println(product.getValue());
        }

        System.out.println("Fui executado!");
    }
}
