package br.com.casadocodigo.bookstore.products;

@FunctionalInterface
public interface Promotional {
    boolean applyDiscount(double porcentagem);

    default boolean apply10PercentDiscount() {
        return applyDiscount(0.1);
    }
}
