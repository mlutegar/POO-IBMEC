package Controlador;

import java.util.ArrayList;
import Modelo.Aluno;

public class AlunoDAO {
    ArrayList <Aluno> alunos = new ArrayList <Aluno> ();

    public void cadastrarAluno(String nome, String matricula, String curso) {
        Aluno aluno = new Aluno(nome, matricula, curso);
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setCurso(novoCurso);
                break;
            }
        }
    }

    public String buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno.toString();
            }
        }
        return "null";
    }

    public String listarAlunos() {
        String alunosTexto = "";
        for (Aluno aluno : alunos) {
            alunosTexto += aluno.toString() + "\n\n";
        }
        return alunosTexto;
    }

}
