package entidades;

import java.util.Objects;

public class Aluno {
    private String nome, matricula, curso;

    // construtor: inicializa os atributos
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // getMatricula: retorna a matrícula do aluno
    public String getMatricula() {
        return this.matricula;
    }

    // getNome: retorna o nome do aluno
    public String getNome() {
        return this.nome;
    }

    // getCurso: retorna o curso do aluno
    public String getCurso() {
        return this.curso;
    }

    // setCurso: atualiza o curso do aluno
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // equals: verifica se o objeto é um aluno e se a matrícula é igual
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Aluno)) return false;

        Aluno aluno = (Aluno) obj;
        return aluno.matricula.equals(this.matricula);
    }

    // hashCode: retorna o hashcode do objeto
    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome, curso);
    }

    // toString: retorna uma string com os dados do aluno
    @Override
    public String toString() {
        return this.nome + ";" + this.matricula + ";" + this.curso;
    }
}