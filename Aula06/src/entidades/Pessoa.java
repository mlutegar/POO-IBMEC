package entidades;

public abstract class Pessoa{
    protected String nome;
    protected String corpo;
    protected double posX, posY;

    public Pessoa(String nome, String corpo) {
        this.nome = nome;
        this.corpo = corpo;
        this.posX = 0;
        this.posY = 0;
    }

    public void movimentar(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public String exibePosicao() {
        return "Posição: " + this.posX + ", " + this.posY;
    }

    public abstract void falar();

}