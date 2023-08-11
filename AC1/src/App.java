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
        num = 24;
        System.out.println("\n" + num + " É PRIMO?");
        ePrimo(num);

        // 4. DIA DA SEMANA
        num = 4;
        System.out.println("\nQUAL É O " + num + "º DIA DA SEMANA?");
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

    // calcularMedia: método que calcula a média a partir da seguinte fórmula: 
    public static double calcularMedia(double ap1, double ap2, double ac){
        return (ap1+ap2) * 0.4 + ac * 0.2;
    }

    // escreverNumeros150A200: método que exibe os números de 150 a 200
    public static void escreverNumeros150A200() {
        for (int i = 150; i <= 200; i++) {
            System.out.print(i + " ");
        }
    }

    // ePrimo: método que retorna se um número é primo ou não. caso seja, ele lista todos os números primos.
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
            System.out.println();

        } else{
            System.out.println("É um número primo.");
        }
    }

    // diaDaSemana: método que exibe o dia da semana correspondete a um número inteiro
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

    // eBissexto: método que diz se um ano é bissexto ou não.
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


