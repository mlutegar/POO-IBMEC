package entidades.pessoas;

import entidades.Pessoa;

public class Jogador extends Pessoa{
    private String time;
    private String uniforme;
    private int numCamisa;

    public Jogador(String nome, String corpo, String time, String uniforme, int numCamisa) {
        // O que o super faz?
        // O super chama o construtor da classe pai
        super(nome, corpo);
        this.time = time;
        this.uniforme = uniforme;
        this.numCamisa = numCamisa;
    }

    @Override
    public void falar() {
        System.out.println("Um jogador está falando");
    }

    @Override
    public void movimentar(double novaPosX, double novaPosY) {
        super.movimentar(novaPosX, novaPosY);
        System.out.println("Um jogador está se movimentando");
    }
}