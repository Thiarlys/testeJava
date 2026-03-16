package arquivos.fileReaderEBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        String path = "c:\\Users\\Thiarllys\\Documents\\hi.txt"; // Caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // try with resources declarando BufferedReader e FileReader
            String line = br.readLine(); // Variável recebendo a linha do arquivo

            while (line != null) { // Verifica se não chegou ao fim
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
