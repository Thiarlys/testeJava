package listas.aumentoSalarial.aplication;

/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.*/

import listas.aumentoSalarial.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++ ) {
            System.out.println("Digite os dados do " + i + "º funcionário: ");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            employees.add(new Employee(id,nome,salario));

        }

        System.out.println("Digite o id do funcionário que deseja dar o aumento: ");
        int idFuncionario = sc.nextInt();
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getId() == idFuncionario) {
                    System.out.println("Quanto porcento de aumento deseja dar a esse funcionário? ");
                    int percent = sc.nextInt();
                    emp.aumentoSalarial(percent);
                }
            }else {
                System.out.println("Funcionário não encontrado.");
            }
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
