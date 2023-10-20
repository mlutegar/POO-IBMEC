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

    public void buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println(aluno.toString());
                break;
            }
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
            System.out.println("--------------------------");
        }
    }

}
