package vetores.altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas irão fornecer suas alturas? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println(" Qual a altura da " + (i + 1) + "º pessoa? ");
            double altura = sc.nextDouble();
            vect[i] = altura;
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double alturaMedia = sum / vect.length;
        System.out.printf("A altura média é %.2f",alturaMedia);



        sc.close();
    }
}
