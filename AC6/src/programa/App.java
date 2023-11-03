package programa;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Cli cli = new Cli("src/arquivos/alunos.txt");
        int opcao = 0;

        while (opcao != -1){
            cli.exibirOpcoes();
            opcao = cli.escolherOpcoes();
        }

    }
}