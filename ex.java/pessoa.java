
public class pessoa {

    // ETAPA 1 - Atributos
    private String nome;
    private int idade;

    // ETAPA 2 - Construtor
    public pessoa(String nome, int idade) {
       this.nome = nome;
       this.idade = idade;
    }

    // ETAPA 3 - Encapsulamento
    public String getNome() {
        // TODO: retornar o nome
        return this.nome;
    }

    public void setNome(String nome) {
        // TODO: atualizar o nome
        this.nome = nome;
    }

    public int getIdade() {
        // TODO: retornar a idade
        return this.idade;
    }

    public void setIdade(int idade) {
        // TODO: impedir idades negativas
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    // ETAPA 4 - Polimorfismo
    public void exibirInformacoes() {
        // TODO: exibir nome e idade

        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
    }
}
