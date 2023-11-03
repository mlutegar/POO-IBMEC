package programa;

import persistencia.AlunoDB;
import util.LeituraDado;

import java.io.IOException;

public class Cli {
    LeituraDado l;
    AlunoDB db;

    public Cli(String caminho) throws IOException {
        this.l = new LeituraDado();
        this.db = new AlunoDB(caminho);
    }

    public void exibirOpcoes() {
        System.out.println("\n| MENU |");
        System.out.println("1 - Incluir aluno");
        System.out.println("2 - Remover aluno");
        System.out.println("3 - Editar aluno");
        System.out.println("4 - Buscar aluno");
        System.out.println("5 - Listar alunos");
        System.out.println("6 - Sair");
    }

    public int escolherOpcoes() throws IOException{
        int opcao = l.lerInt("Digite a opção desejada: ");

        switch (opcao) {
            case 1:
                System.out.println("\n| INCLUIR ALUNO |");
                incluirAluno();
                break;
            case 2:
                System.out.println("\n| REMOVER ALUNO |");
                removerAluno();
                break;
            case 3:
                System.out.println("\n| EDITAR ALUNO |");
                editarAluno();
                break;
            case 4:
                System.out.println("\n| BUSCAR ALUNO |");
                buscarAluno();
                break;
            case 5:
                System.out.println("\n| LISTAR ALUNOS |");
                listarAlunos();
                break;
            case 6:
                db.exportarAlunos();
                System.out.println("Saindo...");
                opcao = -1;
                break;
            default:
                System.out.println("ERROR: Opção inválida!");
                break;
        }

        return opcao;
    }

    public void incluirAluno() {
        String nome;
        String matricula;
        String curso;

        nome = l.lerStrings("Digite o nome do aluno: ");
        matricula = l.lerStrings("Digite a matrícula do aluno: ");
        curso = l.lerStrings("Digite o curso do aluno: ");

        String[] dados = new String[]{nome, matricula, curso};

        db.cadastrarAluno(dados);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void removerAluno() {
        String matricula;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");
        if (db.buscarAluno(matricula) == null){
            System.out.println("Aluno não encontrado");
            return;
        }

        db.removerAluno(matricula);
        System.out.println("Aluno removido com sucesso!");
    }

    public void editarAluno() {
        String novoNome;
        String matricula;
        String novoCurso;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");

        if (db.buscarAluno(matricula) == null){
            System.out.println("Aluno não encontrado");
            return;
        }

        novoNome = l.lerStrings("Digite o novo nome do aluno: ");
        novoCurso = l.lerStrings("Digite o novo curso do aluno: ");
        String[] dados = new String[]{novoNome, matricula, novoCurso};
        db.editarAluno(dados);
        System.out.println("Aluno editado com sucesso!");
    }

    public void buscarAluno() {
        String matricula;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");

        if (db.buscarAluno(matricula) == null){
            System.out.println("Aluno não encontrado");
            return;
        }

        System.out.println(db.buscarAluno(matricula));
    }

    public void listarAlunos() {
        if (db.listarAlunos().isEmpty()) {
            System.out.println("Não há alunos cadastrados!");
            return;
        }

        System.out.println(db.toString());
    }
}
