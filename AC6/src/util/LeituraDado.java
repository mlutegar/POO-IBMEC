package util;

import java.util.Scanner;

public class LeituraDado {
    Scanner scanner;

    // Constructor que inicializa o scanner
    public LeituraDado(){
        this.scanner = new Scanner(System.in);
    }

    // lerStrings: lê uma string do teclado
    public String lerStrings(){
        return this.scanner.nextLine();
    }

    // lerStrings: lê uma string do teclado com uma mensagem
    public String lerStrings(String msg){
        System.out.print(msg);
        return this.scanner.nextLine();
    }

    // lerInt: lê um inteiro do teclado com uma mensagem
    public int lerInt(String msg){
        System.out.print(msg);
        int num = this.scanner.nextInt();
        this.scanner.nextLine();
        return num;
    }

    // lerDouble: lê um double do teclado com uma mensagem
    public double lerDouble(String msg){
        System.out.print(msg);
        double num = this.scanner.nextDouble();
        this.scanner.nextLine();
        return num;
    }

    // aguardar: aguarda o usuário pressionar enter
    public void aguardar(){
        this.scanner.nextLine();
    }
}