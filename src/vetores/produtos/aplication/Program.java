package vetores.produtos.aplication;
/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/

import vetores.produtos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de produtos: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++ ) {
            System.out.println("Qual o nome do produto? ");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Qual o valor do produto? ");
            double price = sc.nextDouble();

            products[i] = new Product(name,price);
        }

        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        double media = sum / products.length;

        System.out.printf("O preço médio dos produtos é %.2f%n", media);



        sc.close();
    }
}
