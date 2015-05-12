package main;

//// passar aquivo de experimento aqui.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipuladorArquivos {

    public static void leitorArquivo(String arq) throws IOException {

        File arquivo = new File(arq);

        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(arquivo));

            String linha = "";
            while (true) {
                if (linha != null) {

                    // pegar nome arquivo de processos
                    System.out.println(linha);

                } else {
                    break;
                }
                linha = buffRead.readLine();
            }
            buffRead.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipuladorArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void gravarArquivo(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();


    }

}
