
import java.util.ArrayList;

public class turma {

    private String codigo;
    private professor professor;
    private ArrayList<Aluno> alunos;

    public turma(String codigo, professor professor) {

        this.codigo = codigo;
        this.professor = professor;
        this.alunos = new ArrayList<>();

        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
       alunos.add(aluno);
    }

    public void listarAlunos() {

        for (Aluno aluno : alunos) {
            aluno.exibirInformacoes();
        }

        
        // TODO: percorrer a lista usando for
        // e exibir as informações dos alunos
    }

    public int quantidadeAlunos() {
        // TODO: retornar a quantidade de alunos
        return alunos.size();
    }
}
