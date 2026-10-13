
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        sistemaCadastro sistema = new sistemaCadastro();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite a matricula do aluno: ");
                    String matricula = scanner.nextLine();

                    System.out.print("Digite o curso do aluno: ");
                    String curso = scanner.nextLine();

                    Aluno novoAluno = new Aluno(nome, idade, matricula, curso);

                    sistema.cadastrarAluno(novoAluno);

                    System.out.println("Aluno cadastrado com sucesso!");

                    break;

                case 2:
                    System.out.println("\n=== LISTA DE ALUNOS ===");
                    sistema.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite a matricula do aluno: ");
                    String matriculaBusca = scanner.nextLine();
                    Aluno alunoEncontrado = sistema.buscarAluno(matriculaBusca);
                    if (alunoEncontrado != null) {
                        System.out.println("\n=== INFORMACOES DO ALUNO ===");
                        alunoEncontrado.exibirInformacoes();
                    } else {
                        System.out.println("Aluno nao encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Digite a matricula do aluno: ");
                    String matriculaRemocao = scanner.nextLine();
                    if (sistema.removerAluno(matriculaRemocao)) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno nao encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
