package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import util.Arquivo;
import entidades.Aluno;

public class AlunoDAO {
    List<Aluno> alunos = new ArrayList <Aluno> ();
    String caminho;

    // construtor: inicializa o caminho do arquivo
    public AlunoDAO(String caminho) throws IOException { // O IOException é para o caso a operação de leitura do arquivo falhar
        this.caminho = caminho;
        this.importarAlunos();
    }

    // cadastrarAluno: cadastra um aluno
    public void cadastrarAluno(String[] dadosAluno) {
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1], dadosAluno[2]);
        if (!this.alunos.contains(aluno)){ this.alunos.add(aluno); }
    }

    // removerAluno: remove um aluno
    public String removerAluno(String matricula) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                this.alunos.remove(aluno);
                return aluno.getMatricula();
            }
        }
        return "";
    }

    // editarAluno: edita um aluno
    public void editarAluno(String[] dadosAluno) {
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1], dadosAluno[2]);
        int index = this.alunos.indexOf(aluno);
        if (index != -1) {
            this.alunos.set(index, aluno);
        }
    }

    // buscarAluno: busca um aluno
    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    // listarAlunos: lista todos os alunos
    public String listarAlunos() {
        if (this.alunos.isEmpty()) {
            return "";
        }

        StringBuilder tabela = new StringBuilder();
        tabela.append(String.format("\n| %-20s | %-20s | %-20s |", "Nome", "Matricula", "Curso"));

        for (Aluno aluno : this.alunos) {
            tabela.append(String.format("\n| %-20s | %-20s | %-20s |", aluno.getNome(), aluno.getMatricula(), aluno.getCurso()));
        }

        return tabela.toString();
    }

    // exortarAlunos: exporta os alunos para um arquivo (salva)
    public void exportarAlunos() throws IOException{
        List<String> linhas = new ArrayList<String>();

        for (Aluno aluno : this.alunos) {
            linhas.add(aluno.toString());
        }

        Arquivo.escrever(this.caminho, linhas);
    }

    // importarAlunos: importa os alunos de um arquivo (carrega)
    public void importarAlunos() throws IOException{
        List<String> linhas = Arquivo.ler(caminho);

        for (String linha : linhas) {
            String[]dadosAluno = linha.split(";");
            this.cadastrarAluno(dadosAluno);
        }
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();
        for (Aluno aluno : this.alunos) {
            msg.append(aluno).append("\n");
        }
        return msg.toString();
    }
}