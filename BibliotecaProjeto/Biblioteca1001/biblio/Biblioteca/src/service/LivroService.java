package service;

import model.Livro;

import java.util.ArrayList;

public class LivroService {

        private ArrayList<Livro> livros = new ArrayList<>();

        public void cadastrarLivro(Livro l){
            livros.add(l);
            System.out.println("Livro cadastrado com sucesso.");
        }


        public void consultarLivros() {
            System.out.println("Lista de Livros:");
            for (Livro livro : livros) {
                String status = livro.isEmprestado() ? "Emprestado" : "Disponível";
                System.out.println("- " + livro.getTitulo() + " (" + status + ")");
            }
        }



    }
