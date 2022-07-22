package br.com.casadocodigo.bookstore;

public class Author {
    private String name;
    private String email;
    private String cpf;
    public void showDetails() {
        System.out.println("Monstrando detalhes do br.com.casadocodigo.bookstore.Author");
        System.out.println("Nome: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
    }
    @Override
    public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        return this.name.equals(otherAuthor.name);
    }
    //Gettes and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
