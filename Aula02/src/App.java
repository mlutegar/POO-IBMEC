/*
 * Aula 02 - Tipos de dados, operadores, estruturas de decisão e repetição
 * Curso: Programação Orientada a Objetos com Java
 * Prof.: Victor
 * Data: 2023-08-11
 * Anotado por: Michel
 */

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

        // 6. Estrutura de decisão
        // a) if-else
        int idade = 15;

        if(idade > 18){
            System.out.println("Você é maior de idade");
        } else if (idade < 0){
            System.out.println("Idade invalidade");
        } else{
            System.out.println("Você é menor de idade");
        }

        // NÃO É BOA PRÁTICA: se tiver apenas um comando dentro do if, é possível ocultar as chaves
        if(idade > 18)
            System.out.println("Você é maior de idade");
        else
            System.out.println("Você é menor de idade");

        // b) switch
        String opcao = "a";

        switch(opcao){
            case "a":
                System.out.println("A");
                break; // é preciso colocar o break para não os outros cases, pois sempre que executa um case e ele executa o resto.
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            case "d":
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }

        // 7. Estrutura de repetição
        // a) for
        for (int i = 0; i <= 5; i++){ // a variavel i apenas existe dentro do escopo do for.
            System.out.println(i);
        }

        int i;
        for (i = 0; i <= 5; i++){
            System.out.println(i);
        }

        for (i = 0; i < 10; i++) {
            if (i==3) {
                continue; // passa a iteração
            }

            System.out.println(i);

            if (i==5) {
                break;
            }
        }

        // b) while
        i = 10;
        while (i > 0) {
            System.out.println(i--);
        }
    }
}