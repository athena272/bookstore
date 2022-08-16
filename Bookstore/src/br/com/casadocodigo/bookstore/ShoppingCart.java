package br.com.casadocodigo.bookstore;

import br.com.casadocodigo.bookstore.products.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private double total;
    private List<Product> products;
    public ShoppingCart() {
        this.products = new ArrayList<Product>();
    }
    public void adiciona(Product product) {
        this.products.add(product);
    }
    public void remove(int posicao) {
        this.products.remove(posicao);
    }

    public double getTotal() {
        return this.total;
    }
    public List<Product> getProdutos() {
        return this.products;
    }


}
