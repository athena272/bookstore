package br.com.casadocodigo.bookstore.products;

import br.com.casadocodigo.bookstore.Author;

public class PhysicalBook extends Book implements Promotional {
    public PhysicalBook(Author author) {
        super(author);
    }

    public double getTaxaImpressao() {
        return this.getValue() * 0.05;
    }
    public boolean aplyDiscount(double percentage) {
        if(percentage > 0.3) {
            return false;
        }
        double discount = this.getValue() * percentage;
        this.setValue(this.getValue() - discount);
        System.out.println("Aplicando discount no br.com.casadocodigo.bookstore.products.PhysicalBook");
        return true;
    }
}
