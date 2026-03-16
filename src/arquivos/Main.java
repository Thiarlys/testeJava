package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        File file = new File("c:\\Users\\Thiarllys\\Documents\\hi.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file); // Scanner recebe file como argumento
            while (sc.hasNextLine()) { // verifica se tem uma proxima linha no arquivo
                System.out.println(sc.nextLine());
            }
        }catch (IOException e) { //Trata IOexception
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) { // Fecha o Scanner caso não seja nulo
                sc.close();
            }
        }
    }
}
