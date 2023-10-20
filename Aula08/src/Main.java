import java.util.*;

public class Main {

    public static void main(String[] args) {
        // vetores();
        // arraylist();
        // linkedlist();
        // stack();
        // queue();
        // conjunto();
        // mapas();
    }

    public static void vetores() {
        int tamanho = 10;
        int[] arrayInteiros = new int[tamanho];
        System.out.println(arrayInteiros);

        String[] letras = {"a", "b", "c"};
        System.out.println(letras);

        System.out.println(letras.length);


        System.out.println(letras);

        System.out.println(letras[1]);
        letras[1] = "d";
        System.out.println(letras[1]);

        arrayInteiros[0] = 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.println(arrayInteiros[i]);
        }

        for (String letra : letras) {
            System.out.println(letra);
        }
    }

    // Isso não é possivel em golang pois o tamanho do array é fixo
    public static String[] aumentaVetor(String[] vetor) {
        String[] novoVetor = new String[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }

    public static void arraylist(){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println(numeros);

        numeros.add(8);
        numeros.add(9);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(0));

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        numeros.remove(0);

        System.out.println(numeros.contains(8)); // false

        numeros.add(0, 8);

        numeros.set(0, 10); // altera o valor do indice 0 para 10

        numeros.indexOf(8); // retorna o primeiro indice do elemento 8

    }

    public static void linkedlist(){
        LinkedList<String> carros = new LinkedList<String>();
        System.out.println(carros);

        carros.add("Fusca");
        carros.add(0, "Gol");
        carros.remove("Fusca");

        System.out.println(carros);
        System.out.println(carros.indexOf("Gol"));

        // pop e push são mais rapidos que add e remove
        carros.push("Fusca");
        carros.pop();

    }

    public static void pilhas(){
        Stack<Double> notas = new Stack<Double>();

        notas.push(8.0); // adiciona no topo
        notas.push(9.0);

        System.out.println(notas.peek()); // retorna o elemento do topo
        notas.pop(); // remove o elemento do topo

        System.out.println(notas);


    }

    public static void conjunto(){
        HashSet<String> nomes = new HashSet<String>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("João"); // não adiciona pois já existe

        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes.contains("João")); // true

    }

    public static void mapas(){
        HashMap<String, String> pessoas = new HashMap<>();

        pessoas.put("1", "João");
        pessoas.put("2", "Maria");

        System.out.println(pessoas);
        System.out.println(pessoas.get("1")); // João

        System.out.println(pessoas.containsKey("1")); // true
        System.out.println(pessoas.containsValue("João")); // true

        for (String key : pessoas.keySet()) {
            System.out.println(key);
        } // 1, 2

        for (String value : pessoas.values()) {
            System.out.println(value);
        } // João, Maria
    }


    // Se usa vetor quando se sabe o tamanho do array
    // Se usa arraylist quando não se sabe o tamanho do array. E você quer acessar os elementos com muita frequencia
    // Se usa linkedlist quando não se sabe o tamanho do array. E você quer adicionar e remover elementos com muita frequencia
    // Se usa pilha quando você quer adicionar e remover elementos do topo com muita frequencia
    // Se usa fila quando você quer adicionar e remover elementos do inicio e do fim com muita frequencia
    // Se usa conjunto quando você quer remover elementos duplicados. E não se importa com a ordem dos elementos.
}