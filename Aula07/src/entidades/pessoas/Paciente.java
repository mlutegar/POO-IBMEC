package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;
import entidades.PlanoSaude;

public class Paciente extends Pessoa{
    private PlanoSaude plano;

    public Paciente(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        super(nome, cpf, endereco, dataNascimento);
        this.plano = new PlanoSaude();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            "Plano de saúde: " + this.plano;
    }
}