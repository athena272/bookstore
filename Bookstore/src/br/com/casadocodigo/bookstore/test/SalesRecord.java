package br.com.casadocodigo.bookstore.test;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.ShoppingCart;
import br.com.casadocodigo.bookstore.products.Ebook;
import br.com.casadocodigo.bookstore.products.PhysicalBook;
import br.com.casadocodigo.bookstore.products.Product;

import java.util.List;

public class SalesRecord {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Mauricio Aniche");

        PhysicalBook book = new PhysicalBook(author);
        book.setName("Test-Driven Development");
        book.setValue(59.90);

        Ebook ebook = new Ebook(author);
        ebook.setName("Test-Driven Development");
        ebook.setValue(29.90);

        if(book.apply10PercentDiscount()) {
            System.out.println("Valor agora é: " + book.getValue());
        }

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.adiciona(book);
        shoppingCart.adiciona(ebook);
        System.out.println("Total: " + shoppingCart.getTotal());

        List<Product> products = shoppingCart.getProdutos();
        for(Product product : products) {
            System.out.println(product.getValue());
        }

        System.out.println("Fui executado!");
    }
}
