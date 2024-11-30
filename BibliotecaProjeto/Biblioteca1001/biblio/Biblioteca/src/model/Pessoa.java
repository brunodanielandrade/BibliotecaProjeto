package model;


public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public abstract void exibirInformacoes();
}
