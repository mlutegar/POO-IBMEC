// Comentário de linha

/*
 * Comentário de bloco.
 * É possível escrever várias linhas.
 */

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Comando para escrever no console. É possível escrever sysout também.
        System.out.println("Hello, World!");

        // 2. Declaração de uma variável
        // <tipoVar> <nomeVar1>, <nomeVar2>, <nomeVar3>, ...;
        double x, y, z;
        // <tipoVar> <nomeVar> <valor>
        String nome = "Michel";

        // 3. Tipos de dados
        // a) Inteiros
        byte a = -50; // 8 bits -> -128 a 127
        short b = 15750; // 16 bits -> -32.768 a 32.767
        int c = 105000; // 32 bits -> Padrão
        long d = 15600000l; // 64 bits, é preciso terminar com a letra 'l'

        // b) Decimais
        float e = 4.85f; // 32 bits, precisa terminar com a letra 'f'
        double f = -105.48; // 64 bits -> Padrão

        // c) Booleanos
        boolean test = true;
        boolean outroTeste = false;

        // d) Texto
        char letra = 'a'; // Usa aspas simples e ocupa 2 bytes. Utilizando o código UNICODE.
        String palavra = "arroz"; // Não é um tipo de dado primitivo.

        // 4. Conversão (Type casting)
        f = (double) b;

        System.out.println("\n-----------------\n");
        System.out.println(e); // 4.85
        c = (int) e;
        System.out.println(c); // 4 (Há um truncamento)

        // 5. Operadores
        // a) aritméticos
        x = 18.5;
        y = -4.5;
        z = 2.2;

        System.out.println("\n-----------------\n");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    
        // b) atribuição
        x += 2; // x = x + 2
        z -= 1.5;
        x++; // x = x + 1
        y--;

        System.out.println("\n-----------------\n");
        System.out.println(x);
        System.out.println(x++); // Usa a variavel e depois incrementa
        System.out.println(x);
        System.out.println(++x); // Incremento e depois uso a variavel

        // c) comparação
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);

        // d) lógicos
        System.out.println(!false); // NOT
        System.out.println(true && false); // AND
        System.out.println(true || false); // OR
        
    }
}