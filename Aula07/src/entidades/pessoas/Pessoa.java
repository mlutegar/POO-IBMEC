package entidades.pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Endereco;

public abstract class Pessoa {
    private String nome, cpf;
    private Endereco endereco;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataNascimento.format(formato);
    }

    @Override
    public String toString() {
        return this.nome + "\n" +
            "CPF: " + this.cpf + "\n" +
            "Endereço: " + this.endereco + "\n" +
            "Data de nascimento: " + this.getDataNascimento();
    }
}
