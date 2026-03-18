package arquivos.exercicioPratico.application;

import arquivos.exercicioPratico.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        File path = new File("C:\\Users\\Thiarllys\\Documents\\ArquivosAulaJava\\Inventory\\products.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(","); //Usando String.split para ler dados do arquivo .csv
                String name = data[0];

                String priceStr = data[1];
                double price = Double.parseDouble(priceStr);

                String quantityStr = data[2];
                int quantity = Integer.parseInt(quantityStr);
                products.add(new Product(name,price,quantity));

                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        File outFolder = new File(path.getParent(),"\\out");
        if (!outFolder.exists()) {
            outFolder.mkdir(); //Criando nova pasta
        }
        File fileSummary = new File(outFolder,"Summary.csv");//Criando novo arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileSummary))){
            for (Product product : products) {
                bw.write(product.toString()); //Escrevendo dados no novo arquivo
                bw.newLine(); //Quebra de linha
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
