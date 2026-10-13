
public class professor extends pessoa {

    private String disciplina;
    private double salario;

    public professor(String nome, int idade,
                     String disciplina, double salario) {

        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;

        // TODO: inicializar os atributos
    }

    @Override
    public void exibirInformacoes() {
        // TODO: exibir os dados do professor
        System.out.println("Disciplina:" + this.disciplina);
        System.out.println("Salário:" + this.salario);
    }
}
