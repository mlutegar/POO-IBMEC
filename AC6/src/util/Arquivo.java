package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Classe usada para ler e escrever arquivos
public class Arquivo {

    // ler: classe que lê um arquivo
    public static List<String> ler(String caminho) throws IOException {
        File arquivo = new File(caminho);
        BufferedReader buffRead;
        List<String> linhas = new ArrayList<>();
        String linha = "";

        // verifica se o arquivo existe
        if (!arquivo.exists() || arquivo.isDirectory()){
            return linhas;
        }

        buffRead = new BufferedReader(new FileReader(caminho));
        while (true) {
            if (linha != null) {
                if (!linha.equals("")) {
                    linhas.add(linha);
                }
            } else {
                break;
            }

            linha = buffRead.readLine();
        }

        buffRead.close();
        return linhas;
    }

    // escrever: classe que escreve um arquivo
    public static void escrever(String caminho, List<String> linhas) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));

        for (String linha : linhas) {
            buffWrite.append(linha + "\n");
        }

        buffWrite.close();
    }

}
