public class Aluno extends pessoa {

    private String matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade,
                 String matricula, String curso) {

        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
        // TODO: inicializar matricula e curso
    }

    // Encapsulamento
    public String getMatricula() {
        // TODO
        return this.matricula;
    }

    public String getCurso() {
        // TODO
        return this.curso;
    }

    public void setCurso(String curso) {
        // TODO
        this.curso = curso;
    }

    // Polimorfismo
    @Override
    public void exibirInformacoes() {

        System.out.println("Matricula:" + this.matricula);
        System.out.println("Curso:" + this.curso);
        // TODO: exibir os dados do aluno
        // DICA: você pode usar super.exibirInformacoes()
    }
}
