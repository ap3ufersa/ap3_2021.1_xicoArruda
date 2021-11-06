package br.com.ap3.u3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C2_Arquivo_ContarCaracteres {
    public static void main(String[] args) {
        // é uma forma diferente, passando argumentos para o programa
        // no vscode precisa usar as configurações do launch.json
        if (args.length < 1) {
            System.err.println("Sintaxe: ContadorCaracteresArquivo arq [arq ...]");
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            try {
                int qntCaracteres = contaCaracteres(args[i]);
                System.out.println(args[i] + ": " + qntCaracteres + " caracteres.");
                gravaArquivo(qntCaracteres);
            } catch (IOException e) {
                System.err.println(args[i] + ": Erro: " + e.getMessage());
            }
        }
    }

    static int contaCaracteres(String nomeArquivo) throws IOException {
        FileReader arq = new FileReader(nomeArquivo);
        BufferedReader lerArq = new BufferedReader(arq);

        int contadorCaracteres = 0;

        try {
            while (lerArq.read() >= 0)
                contadorCaracteres++;
        } finally { // isso é feito mesmo que haja exception
            arq.close();
            lerArq.close();
        }

        return contadorCaracteres;
    }

    static void gravaArquivo(int qntCaracteres) throws IOException {
        FileWriter arq = new FileWriter("quantCaracteres.txt"); // append?
        BufferedWriter escreveArq = new BufferedWriter(arq);
        
        escreveArq.write(Integer.toString(qntCaracteres));
        escreveArq.newLine();

        escreveArq.close();
        arq.close();

        //Erros:
        //int não tá sendo escrito, tem que transfomar para String Integer.toString(qntCaracteres));
        //erro, stream closed. Pq? A ordem dos close() é diferente.
    }
}