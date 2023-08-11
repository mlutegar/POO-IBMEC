/*
 * 1. Faça um método que receba como parâmetros as três notas da disciplina (AP1, AP2 e AC) e mostre a média.
 * A média é calculada de acordo com a fórmula M = (AP1 + AP2) * 0.4 + AC * 0.2.
 * 
 * 2.Implemente um método que exiba todos os números de 150 a 200.
 * 
 * 3. Elabore um método ePrimo(int num) que retorna se um número num é primo ou não. 
 * Caso o número não seja primo, liste todos os números pelos quais ele é divisível.
 * 
 * 4. Implemente um método que receba como parâmetro um número inteiro e exiba o dia correspondente da semana (1-Domingo, 2- Segunda, etc.), 
 * se digitar outro valor deve aparecer o texto “valor inválido”.
 * 
 * 5. Elabore um método eBissexto(int ano) que receba como parâmetro um número correspondente a um determinado ano e em seguida 
 * informe se este ano é ou não bissexto. Um ano é bissexto se ele é múltiplo de quatro. 
 * No entanto anos múltiplos de 100 que não são múltiplos de 400 não são bissextos. 
 * Então 1995 não é bissexto, 2012 é bissexto, 1900 não é bissexto e 2000 é bissexto.
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        int num;

        // 1. MÉDIA
        System.out.println("MÉDIA: \n" + calcularMedia(9.5, 10, 10));

        // 2. LISTA DE NÚMEROS
        System.out.println("\nLISTA DE NÚMEROS: ");
        escreverNumeros150A200();
        System.out.println();

        // 3. É PRIMO?
        num = 6;
        System.out.println("\n" + num + " É PRIMO?");
        ePrimo(num);

        // 4. DIA DA SEMANA
        num = 4;
        System.out.println("\n\nQUAL É O " + num + "º DIA DA SEMANA?");
        diaDaSemana(num);

        // 5. É BISSEXTO?
        num = 2000;
        System.out.println("\n" + num + " É UM NÚMERO BISSEXTO?");
        if (eBissexto(num)) {
            System.out.println("É um ano bissexto!");
        } else{
            System.out.println("Não é um ano bissexto!");
        }
        

    }

    public static double calcularMedia(double ap1, double ap2, double ac){
        return (ap1+ap2) * 0.4 + ac * 0.2;
    }

    public static void escreverNumeros150A200() {
        for (int i = 150; i <= 200; i++) {
            System.out.print(i + " ");
        }
    }

    public static void ePrimo(int num) {
        int qtdDivisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                qtdDivisores++;
            }    
        }

        if (qtdDivisores > 2) {
            System.out.print("Não é um número primo. Divisores: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }    
            }
        } else{
            System.out.println("É um número primo.");
        }
    }

    public static void diaDaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("É domingo!");
                break;
            case 2:
                System.out.println("É segunda!");
                break;
            case 3:
                System.out.println("É terça!");
                break;
            case 4:
                System.out.println("É quarta!");
                break;
            case 5:
                System.out.println("É quinta!");
                break;
            case 6:
                System.out.println("É sexta!");
                break;
            case 7:
                System.out.println("É sabado!");
                break;                        
            default:
                System.out.println("Dia invalido.");
                break;
        }
    }

    public static boolean eBissexto(int ano) {
        if (ano % 4 == 0) {
            if ((ano % 100 == 0) && !(ano % 400 == 0)) {
                return false;
            }
            return true;
        }

        return false;
    }
}


