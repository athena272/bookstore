package br.com.casadocodigo.bookstore.products;

import br.com.casadocodigo.bookstore.Author;
import br.com.casadocodigo.bookstore.exception.AuthorNullException;

public abstract class Book implements Product {
    private String name;
    private String description;
    private double value;
    private String isbn;
    private Author author;
    //Constructor
    public Book(Author author){

        if(author == null) {
            throw new AuthorNullException("O Author do Book não pode ser nulo");
        }

        this.author = author;
        this.isbn = "000-00-00000-00-0";

    }
    //My Methods
     public void showDetails() {
        System.out.println("Monstrando detalhes do livro");
        System.out.println("Nome: " + this.getName());
        System.out.println("Descrição: " + this.getDescription());
        System.out.println("Valor: " + this.getValue());
        System.out.println("ISBN: " + this.getIsbn());
        if(this.hasAuthor()) {
            this.author.showDetails();
        }
        System.out.println("--");
    }

    //Abstract method with interface
    @Override
    public int compareTo(Product other) {
        if(this.getValue() < other.getValue()) {
            return -1;
        }
        if(this.getValue() >  other.getValue()) {
            return 1;
        }
        return 0;
    }
    public boolean hasAuthor() {
        return this.author != null;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
