package br.com.casadocodigo.bookstore.products;

import br.com.casadocodigo.bookstore.PublishingHouse;

public class Magazine implements Product, Promotional {
    private String name;
    private String description;
    private double value;
    private PublishingHouse publishingHouse;
    //My methodos
    public boolean aplyDiscount(double percentage) {
        if(percentage > 0.1) {
            return false;
        }
        double discount = this.getValue() * percentage;
        this.setValue(this.getValue() - discount);
        return true;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public PublishingHouse getEditora() {
        return publishingHouse;
    }

    public void setEditora(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public int compareTo(Product outro) {
        if(this.getValue() < outro.getValue()) {
            return -1;
        }
        if(this.getValue() > outro.getValue()) {
            return 1;
        }
        return 0;
    }
}
