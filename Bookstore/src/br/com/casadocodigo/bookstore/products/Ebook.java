package br.com.casadocodigo.bookstore.products;

import br.com.casadocodigo.bookstore.Author;

public class Ebook extends Book implements Promotional {
    private String waterMark;

    public Ebook(Author author)  {
        super(author);
    }
    //My methods
    @Override
    public boolean applyDiscount(double percentage) {
        if(percentage > 0.15) {
            return false;
        }
        double discount = this.getValue() * percentage;
        this.setValue(this.getValue() - discount);
        System.out.println("Aplicando discount no br.com.casadocodigo.bookstore.products.PhysicalBook");
        return true;
    }
    @Override
    public String toString() {
        return "Eu sou um ebook";
    }
    //Getters and Setters
    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

}
