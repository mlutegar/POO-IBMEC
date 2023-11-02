package controlador;

import java.util.ArrayList;

import arquivos.Arquivo;
import entidades.Aluno;

public class AlunoDAO {
    ArrayList <Aluno> alunos = new ArrayList <Aluno> ();
    String caminho;

    // construtor: inicializa o caminho do arquivo
    public AlunoDAO(String caminho) {
        this.caminho = caminho;
    }

    // cadastrarAluno: cadastra um aluno
    public void cadastrarAluno(String nome, String matricula, String curso) {
        Aluno aluno = new Aluno(nome, matricula, curso);
        alunos.add(aluno);
    }

    // removerAluno: remove um aluno
    public String removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                return aluno.getMatricula();
            }
        }

        return "";
    }

    // atualizarCurso: atualiza o curso de um aluno
    public void atualizarCurso(String matricula, String novoCurso) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setCurso(novoCurso);
                break;
            }
        }
    }

    // buscarAluno: busca um aluno
    public String buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno.toString();
            }
        }
        return "null";
    }

    // listarAlunos: lista todos os alunos
    public String listarAlunos() {
        if (alunos.isEmpty()) {
            return "";
        }

        StringBuilder tabela = new StringBuilder();
        tabela.append(String.format("\n| %-20s | %-20s | %-20s |", "Nome", "Matricula", "Curso"));

        for (Aluno aluno : alunos) {
            tabela.append(String.format("\n| %-20s | %-20s | %-20s |", aluno.getNome(), aluno.getMatricula(), aluno.getCurso()));
        }

        return tabela.toString();
    }

    // exortarAlunos: exporta os alunos para um arquivo (salva)
    public void exportarAlunos() {
        ArrayList<String> linhas = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            linhas.add(aluno.getNome() + ";" + aluno.getMatricula() + ";" + aluno.getCurso());
        }
        Arquivo arquivo = new Arquivo();
        arquivo.escrever(caminho, linhas);
    }

    // importarAlunos: importa os alunos de um arquivo (carrega)
    public void importarAlunos() {
        Arquivo arquivo = new Arquivo();
        ArrayList<String> linhas = arquivo.ler(caminho);
        for (String linha : linhas) {
            String[] dados = linha.split(";");
            cadastrarAluno(dados[0], dados[1], dados[2]);
        }
    }
}