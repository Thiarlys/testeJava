package vetores.aluguel.aplication;

import vetores.aluguel.entities.Rent;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.println("Quantos estudantes vão alugar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite seu nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Digite seu email: ");
            String email = sc.nextLine();

            System.out.println("Digite o número do quarto desejado: (0-9)");
            int quarto = sc.nextInt();

            rents[quarto] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++) {
            if (rents[i] != null) {
                System.out.println(i + " " + rents[i]);
            }
        }




        sc.close();
    }
}
