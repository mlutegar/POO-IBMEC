import entidades.Pessoa;
import entidades.pessoas.Jogador;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1;
        Jogador j1 = new Jogador("Pedro", "Gordo", "São Paulo", "Branco", 10);

        System.out.println(j1.exibePosicao());
        j1.movimentar(10, -5);
        System.out.println(j1.exibePosicao());

        p1 = new Jogador("João", "Magro", "São Paulo", "Branco", 7);

        p1.falar();
    }
}