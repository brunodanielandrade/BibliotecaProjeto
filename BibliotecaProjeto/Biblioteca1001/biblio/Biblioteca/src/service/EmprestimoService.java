package service;

import java.util.ArrayList;
import model.*;

public class EmprestimoService {

    private static ArrayList<Pessoa> leitores = new ArrayList<>();
    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();


    public void emp(){
        System.out.println("\n=== Lista de Empréstimos ===");
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
        } else {
            for (int EmprestimoService = 0; EmprestimoService < emprestimos.size(); EmprestimoService++) {
                System.out.println((EmprestimoService + 1) + ". " + emprestimos.get(EmprestimoService));
            }
        }
    }

}
