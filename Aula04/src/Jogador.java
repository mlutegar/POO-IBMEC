public class Jogador {
    double posX, posY;
    String time, nome, posicionamento;
    double altura, peso, velocidade;
    int numeroCamisa;

    // Método construtor
    Jogador(){ this.time = "Sem time"; }

    Jogador(String nome, String time, double altura, double peso, String posicionamento){
        this.nome = nome;
        this.time = time;
        this.altura = altura;
        this.peso = peso;
        this.velocidade = 0;
        this.posicionamento = posicionamento;
        if (posicionamento.equals("goleiro")) {
            this.posX = -50.0;
            this.posY = 0;
        }
    }

    void andar(double novaPosX, double novaPosY){
        this.posX = novaPosX;
        this.posY = novaPosY;
    }

    void mudarTime(String novoTime){ this.time = novoTime; }
    void mudarTime(int novoNumeroCamisa, String novoTime){
        this.numeroCamisa = novoNumeroCamisa;
        this.time = novoTime;
    }

    // public void finalize(){} - é possivel criar um construtor para finalizar o comando
}
