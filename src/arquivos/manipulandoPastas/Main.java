package arquivos.manipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); // Variável file que receberá o caminho da pasta


        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        if (folders != null) {
            for (File file : folders) {
                System.out.println(file); //Lista pastas
            }
        }else {
            System.out.println("List folders is empty.");
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        if (files != null) {
            for (File file : files) {
                System.out.println(file); //Lista arquivos
            }
        }else {
            System.out.println("List files is empty.");
        }

        boolean success = new File(path + "\\NewFolder").mkdir(); //Cria nova pasta
        System.out.println("Directory created successfully: " + success);
    }
}
