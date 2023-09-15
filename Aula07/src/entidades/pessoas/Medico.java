package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;
import entidades.Especialidade;
import entidades.salas.Consultorio;

public class Medico extends Pessoa {
    private Especialidade especialidade;
    private Consultorio consultorio;
    private String crm;
    private double valorHora;

    public Medico(String nome, String cpf, Endereco endereco, LocalDate dataNascimento, String crm) {
        super(nome, cpf, endereco, dataNascimento);
        this.crm = crm;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Médico(a) " + super.toString() + "\n" +
            "CRM: " + this.crm + "\n" +
            "Especialidade: " + this.especialidade + "\n" +
            "Valor da hora: R$" + this.valorHora + "\n" +
            "Consultório: " + this.consultorio;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(int horasTrabalhadas) {
        return this.valorHora * horasTrabalhadas;
    }

    public void alocaConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}
