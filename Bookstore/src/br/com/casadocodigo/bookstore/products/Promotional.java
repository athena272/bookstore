package br.com.casadocodigo.bookstore.products;

@FunctionalInterface
public interface Promotional {
    boolean aplyDiscount(double porcentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplyDiscount(0.1);
    }
}
