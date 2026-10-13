# Projeto Java — Sistema de Cadastro de Alunos

Roteiro do exercício original, com os trechos de código para completar.

**Nível:** iniciante → intermediário.

## Roteiro do projeto — 6 etapas

1. Classes, objetos e atributos.
2. Construtores e `this`.
3. Encapsulamento, getters e setters.
4. Herança e polimorfismo.
5. Relacionamentos e `ArrayList`.
6. Menu interativo e testes.

## 1. Estrutura dos arquivos

Organização proposta no enunciado:

```text
SistemaAlunos/
└── src/
    ├── Pessoa.java
    ├── Aluno.java
    ├── Professor.java
    ├── Turma.java
    ├── SistemaCadastro.java
    └── Main.java
```

Neste projeto, os arquivos estão em `ex.java/`. Antes de compilar as classes públicas do roteiro, renomeie os arquivos para corresponder exatamente aos nomes das classes acima, incluindo as letras maiúsculas.

## 2. Classe Pessoa — Herança e encapsulamento
Essa será a classe principal, que fornecerá características comuns para alunos e professores.

```java
public class Pessoa {

    // ETAPA 1 - Atributos
    private String nome;
    private int idade;

    // ETAPA 2 - Construtor
    public Pessoa(String nome, int idade) {
        // TODO: inicializar os atributos usando this
    }

    // ETAPA 3 - Encapsulamento
    public String getNome() {
        // TODO: retornar o nome
        return null;
    }

    public void setNome(String nome) {
        // TODO: atualizar o nome
    }

    public int getIdade() {
        // TODO: retornar a idade
        return 0;
    }

    public void setIdade(int idade) {
        // TODO: impedir idades negativas
    }

    // ETAPA 4 - Polimorfismo
    public void exibirInformacoes() {
        // TODO: exibir nome e idade
    }
}
```

Sua missão: completar os métodos e entender por que usamos private, public e this.

## 3. Classe Aluno — Herança
Agora vamos criar uma classe que herda de Pessoa.

```java
public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade,
                 String matricula, String curso) {

        super(nome, idade);

        // TODO: inicializar matricula e curso
    }

    // Encapsulamento
    public String getMatricula() {
        // TODO
        return null;
    }

    public String getCurso() {
        // TODO
        return null;
    }

    public void setCurso(String curso) {
        // TODO
    }

    // Polimorfismo
    @Override
    public void exibirInformacoes() {
        // TODO: exibir os dados do aluno
        // DICA: você pode usar super.exibirInformacoes()
    }
}
```

Aqui aparecem três conceitos:
- extends: indica herança.
- super(): chama o construtor da classe pai.
- @Override: indica a sobrescrita de um método herdado.

## 4. Classe Professor — Herança e polimorfismo
Um professor também é uma pessoa, mas possui atributos específicos.

```java
public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    public Professor(String nome, int idade,
                     String disciplina, double salario) {

        super(nome, idade);

        // TODO: inicializar os atributos
    }

    @Override
    public void exibirInformacoes() {
        // TODO: exibir os dados do professor
    }
}
```

Desafio adicional: criar getters e setters para disciplina e salario, impedindo salários negativos.

## 5. Classe Turma — Relacionamento entre objetos
Aqui começamos a trabalhar com vários objetos juntos.
Uma turma terá um professor e uma lista de alunos.

```java
import java.util.ArrayList;

public class Turma {

    private String codigo;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Professor professor) {

        // TODO: inicializar codigo e professor

        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        // TODO: adicionar aluno na lista
    }

    public void listarAlunos() {
        // TODO: percorrer a lista usando for
        // e exibir as informações dos alunos
    }

    public int quantidadeAlunos() {
        // TODO: retornar a quantidade de alunos
        return 0;
    }
}
```

Essa etapa trabalha com associação, agregação e coleções, assuntos abordados no material da faculdade.

## 6. Classe SistemaCadastro — Lógica do sistema
Esta classe ficará responsável por gerenciar os alunos cadastrados.

```java
import java.util.ArrayList;

public class SistemaCadastro {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        // TODO: adicionar aluno na lista
    }

    public void listarAlunos() {
        // TODO: exibir todos os alunos
    }

    public Aluno buscarAluno(String matricula) {
        // TODO: percorrer a lista
        // e buscar aluno pela matricula
        return null;
    }

    public boolean removerAluno(String matricula) {
        // TODO: remover aluno pela matricula
        // retornar true se encontrou
        return false;
    }
}
```

Aqui você vai praticar bastante if, for, métodos, listas e comparação de String com .equals().

## 7. Classe Main — Menu interativo
Por último, vamos criar a interface do programa pelo terminal.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    // TODO: ler dados com Scanner
                    // criar objeto Aluno
                    // cadastrar no sistema
                    break;

                case 2:
                    // TODO: listar alunos
                    break;

                case 3:
                    // TODO: buscar pela matricula
                    break;

                case 4:
                    // TODO: remover pela matricula
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
```

Quando terminar, seu sistema deverá funcionar mais ou menos assim:

```text
=== SISTEMA DE ALUNOS ===
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno
4 - Remover aluno
0 - Sair

Escolha: 1

Nome: Carlos
Idade: 21
Matrícula: 2026001
Curso: Engenharia de Software

Aluno cadastrado com sucesso!

Escolha: 2

Carlos | 21 anos | 2026001
Engenharia de Software
```

## Como compilar e executar neste projeto

Com um JDK instalado e os comandos `javac` e `java` disponíveis, após completar os códigos e ajustar os nomes dos arquivos, execute a partir da raiz do projeto:

```powershell
cd ex.java
javac -encoding UTF-8 *.java
java Main
```

Esses comandos consideram os arquivos diretamente em `ex.java/`, sem declaração de pacote.

## Checklist de testes

- [ ] Cadastrar um aluno com nome, idade, matrícula e curso.
- [ ] Listar os alunos e conferir os dados cadastrados.
- [ ] Buscar uma matrícula existente e uma inexistente.
- [ ] Remover um aluno existente e tentar remover uma matrícula inexistente.
- [ ] Conferir o retorno dos getters e as alterações feitas pelos setters.
- [ ] Verificar que o setter de idade impede valores negativos.
- [ ] Criar um professor e conferir a exibição dos seus dados.
- [ ] Criar uma turma, adicionar alunos, listar e conferir a quantidade.
- [ ] Verificar a sobrescrita de `exibirInformacoes()` em Aluno e Professor.
- [ ] Selecionar uma opção inexistente e verificar a mensagem do menu.
- [ ] Selecionar `0` e confirmar o encerramento.
- [ ] Se fizer o desafio adicional, verificar que salários negativos são impedidos.
