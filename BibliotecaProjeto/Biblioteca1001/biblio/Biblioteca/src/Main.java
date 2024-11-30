import model.*;
import service.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Emprestimo e = null;
            Leitor leitor = new Leitor();
            Livro livro = new Livro("Harry Potter");
            LeitorService leitorService= new LeitorService();
            LivroService livroService = new LivroService();
            EmprestimoService emprestimoService = new EmprestimoService();


        int opcao;

            do {
                System.out.println("\n=== Sistema de Biblioteca ===");
                System.out.println("1. Cadastrar Leitor");
                System.out.println("2. Consultar Livros");
                System.out.println("3. Realizar Empréstimo");
                System.out.println("4. Consultar Empréstimos");
                System.out.println("5. Listar Leitores");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {


                    case 1 : // Input cadasto  leitor
                        System.out.println("Cadastro de Leitor");
                        System.out.print("Digite o nome do leitor: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o CPF do leitor: ");
                        String cpf = scanner.nextLine();
                        {
                            Leitor novoLeitor = new Leitor(nome, cpf);
                            System.out.println("Leitor cadastrado com sucesso!");
                        }

                        break;

                    case 2: //cod de listar livro
                        livroService.consultarLivros();

                        break;

                    case 3: //cod de listar emprestimo

                        emprestimoService.emp();
                        break;


                    case 4:
                        System.out.println(e);
                        break;

                }
            } while (opcao != 0);

            scanner.close();}
    }