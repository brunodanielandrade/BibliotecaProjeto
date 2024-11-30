package model;

public class Leitor extends Pessoa {
    public Leitor() {
    }

    public Leitor(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("model.Leitor: " + getNome() + " | CPF: " + getCpf());
    }
}
