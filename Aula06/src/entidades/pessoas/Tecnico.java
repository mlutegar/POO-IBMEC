package entidades.pessoas;

import entidades.Pessoa;

public class Tecnico extends Pessoa {

    public Tecnico(String nome, String corpo) {
        super(nome, corpo);
    }

    @Override
    public void falar() {
        System.out.println("Um técnico está falando");
    }

    @Override
    public void movimentar(double novaPosX, double novaPosY) {
        super.movimentar(novaPosX, novaPosY);
        System.out.println("Um técnico está se movimentando");
    }

}
