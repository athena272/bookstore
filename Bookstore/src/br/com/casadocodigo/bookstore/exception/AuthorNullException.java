package br.com.casadocodigo.bookstore.exception;

public class AuthorNullException extends RuntimeException{
    public AuthorNullException(String message) {
        super(message);
    }
}
