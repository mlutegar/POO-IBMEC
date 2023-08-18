import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String msg;
        double num1;
        int num2;

        System.out.println("Informe o texto:");
        msg = leitor.next(); // Lê o input de texto
        System.out.println(msg);

        System.out.println("Informe um double: ");
        num1 = leitor.nextDouble();
        System.out.println(num1);

        System.out.println("Informe um int: ");
        num2 = leitor.nextInt();
        System.out.println(num2);

        leitor.close(); // Usado para fechar o buffer de leitura de dados.

        System.out.println(msg.equals("oi")); // Como a String não é um tipo nativo, e necessário usar o .equals para conseguir comparar.

    }
}