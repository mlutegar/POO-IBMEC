public abstract class Pessoa{
    String nome;
    String corpo;
    double posX, posY;

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

    public abstract void falar();

}