package Modelo;

public class Aluno {
    private String nome, matricula, curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nCurso: " + this.curso;
    }
}
