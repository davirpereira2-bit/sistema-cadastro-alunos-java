

import java.util.ArrayList;

public class sistemaCadastro {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        // TODO: adicionar aluno na lista
    }

    public void listarAlunos() {
        alunos.forEach(aluno -> aluno.exibirInformacoes());
        // TODO: exibir todos os alunos
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        // TODO: percorrer a lista
        // e buscar aluno pela matricula
        return null;
    }

    public boolean removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                // TODO: remover aluno pela matricula
                // retornar true se encontrou
                return true;
            }
        }
        return false;
    }
}

