package arquivos.fileWriterEBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String [] args) {
        String [] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\Users\\Thiarllys\\Documents\\good.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){ // Try with resources
            for (String line : lines) {
                bw.write(line); // bufferedWriter escrevendo a string contida em line
                bw.newLine(); // pulando linha
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
