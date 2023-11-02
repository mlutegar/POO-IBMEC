package gui;

import controlador.AlunoDAO;

public class Cli {
    LeituraDado l = new LeituraDado();
    AlunoDAO a = new AlunoDAO("src/arquivos/alunos.txt");

    public void menu () {
        while (true) {
            System.out.println("\n| MENU |");
            System.out.println("1 - Incluir aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Editar aluno");
            System.out.println("4 - Buscar aluno");
            System.out.println("5 - Listar alunos");
            System.out.println("6 - Sair");

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
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("ERROR: Opção inválida!");
                    break;
            }
        }
    }

    public void incluirAluno() {
        String nome;
        String matricula;
        String curso;

        nome = l.lerStrings("Digite o nome do aluno: ");
        matricula = l.lerStrings("Digite a matrícula do aluno: ");
        curso = l.lerStrings("Digite o curso do aluno: ");

        a.cadastrarAluno(nome, matricula, curso);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void removerAluno() {
        String matricula;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");

        String matriculaRemovida = a.removerAluno(matricula);

        if (matriculaRemovida.equals("")) {
            System.out.println("Aluno não encontrado!");
        } else if (matriculaRemovida.equals(matricula)) {
            System.out.println("Aluno removido com sucesso!");
        }
    }

    public void editarAluno() {
        String matricula;
        String novoCurso;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");
        novoCurso = l.lerStrings("Digite o novo curso do aluno: ");

        a.atualizarCurso(matricula, novoCurso);

        System.out.println("Curso atualizado com sucesso!");
    }

    public void buscarAluno() {
        String matricula;

        matricula = l.lerStrings("Digite a matrícula do aluno: ");

        String aluno = a.buscarAluno(matricula);

        if (aluno.equals("null")) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println(aluno);
        }
    }

    public void listarAlunos() {
        String alunos = a.listarAlunos();

        if (alunos.equals("")) {
            System.out.println("Não há alunos cadastrados!");
        } else {
            System.out.println(alunos);
        }
    }
}
