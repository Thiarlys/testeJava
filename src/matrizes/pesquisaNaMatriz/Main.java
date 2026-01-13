package matrizes.pesquisaNaMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas linhas e colunas deseja ter em sua matriz? ");
        int l = sc.nextInt();
        int c = sc.nextInt();

        int [][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite um valor: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Digite o valor que deseja procurar na matriz: ");
        int valor = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == valor) {
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
