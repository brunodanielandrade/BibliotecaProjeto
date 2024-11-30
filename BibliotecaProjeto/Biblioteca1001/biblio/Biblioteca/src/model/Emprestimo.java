package model;

import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Pessoa leitor;
    private LocalDate dataEmprestimo;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Pessoa leitor) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = LocalDate.now();
    }

    public Livro getLivro() {
        return livro;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataEmprestimo.plusDays(14);
    }


    public void cadastrarLeitor(Leitor l) {
        this.leitor = leitor;
    }

    public void adicionarLivro(Livro li) {
        this.livro = li;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", leitor=" + leitor +
                ", dataEmprestimo=" + dataEmprestimo +
                '}';
    }


   /*  public boolean realizarEmprestimo(String cpf, String tituloLivro) {

        Leitor leitor = leitores.stream()
                .filter(l -> l.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (leitor == null) {
            System.out.println("Leitor não encontrado!");
            return false;
        }

        Livro livro = livros.stream()
                .filter(l -> l.getTitulo().equals(tituloLivro))
                .findFirst()
                .orElse(null);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return false;
        }

*
        // Realizar o empréstimo
        livro.setEmprestado(true);


        LocalDate dataDevolucao = LocalDate.now().plusDays(14);
        System.out.println("Empréstimo realizado com sucesso!");
        System.out.println("Data de devolução: " + dataDevolucao);

        return true;

    }

   */
}
