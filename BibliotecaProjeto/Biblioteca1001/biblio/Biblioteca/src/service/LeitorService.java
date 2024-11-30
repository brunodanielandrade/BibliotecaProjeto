package service;
import model.Leitor;

import java.util.ArrayList;

public class LeitorService {
    private static ArrayList<Leitor> leitor = new ArrayList<>();

    public void cadastrarLeitor(Leitor l) {
        leitor.add(l);
    }

        public void listarLeitores() {
            if (leitor.isEmpty()) {
                System.out.println("Nenhum leitor cadastrado.");
            } else {
                System.out.println("Leitores cadastrados:");
                for (Leitor leitor : leitor) {
                    System.out.println("- Nome: " + leitor.getNome() + ", CPF: " + leitor.getCpf());
                }
            }
        }
    }








