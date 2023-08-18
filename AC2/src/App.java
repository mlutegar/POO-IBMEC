import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Iniciando o leitor de input
        Scanner leitor = new Scanner(System.in);

        // Iniciando as variaveis
        int escolha = 100;
        double num1, num2, resultado;
        String op;

        // Introdução da Calculadora
        System.out.println("CALCULADORA BY MICHEL");
        System.out.println();

        // Pegando o valor do número 1
        System.out.print("Qual é o valor do número 1: ");
        num1 = leitor.nextDouble();

        while (escolha != 0) {
            // Escolhendo a operação
            System.out.print("Qual operação deseja fazer (soma, sub, mult, div): ");
            op = leitor.next();

            // Pegando o valor do número 2
            System.out.print("Qual é o valor do número 2: ");
            num2 = leitor.nextDouble();

            // Realizando operação
            resultado = realizarOperacao(op, num1, num2);
            System.out.println("\nRESULTADO: " + resultado);

            // Perguntando se o usuario pretende limpar, continuar ou parar
            System.out.print("Pretende (1) limpar a memória, (2) inserir nova operação ou (3) sair: ");
            escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.println("\n--------------------\n");
                System.out.print("Qual é o valor do número 1: ");
                num1 = leitor.nextDouble();
                continue;
            } else if (escolha == 2) {
                System.out.println("\n--------------------\n");
                num1 = resultado;
                System.out.println("Número 1: " + num1);
                continue;
            } else if (escolha == 3){
                break;
            }
        }

        leitor.close();
    }

    // realizarOperacao: escolhe a operação e a executa
    public static double realizarOperacao(String operacao, double num1, double num2) {
        switch (operacao) {
            case "soma":
                return soma(num1, num2);
            case "sub":
                return sub(num1, num2);
            case "mult":
                return mult(num1, num2);
            case "div":
                return div(num1, num2);
            default:
                return 0;
        }
    }

    // soma: soma dois números
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    // sub: subtrai dois números
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    // mult: multiplica dois números
    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    // div: divide dois números
    public static double div(double num1, double num2) {
        return num1 / num2;
    }
}
