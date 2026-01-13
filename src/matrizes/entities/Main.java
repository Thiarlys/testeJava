package matrizes.entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas terá a matriz? ");
        int n = sc.nextInt();

        int [][] mat = new int[n][n];

        // O laço for abaixo vai inserir os numeros na matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite um valor: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        // O laço for abaixo serve para identificar os numeros na diagonal da matriz
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        /*O laço for abaixo serve para percorrer todos elementos da matriz e verificar se são negativos,
        a cada elemento negativo a variavel cont recebe +1 de valor e no fim nos mostrará quantos elementos negativos
        tem na matriz.
         */
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.println("Existem " + cont + " elementos negativos na matriz.");



        sc.close();
    }
}
