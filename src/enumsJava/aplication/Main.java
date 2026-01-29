package enumsJava.aplication;

import enumsJava.entities.Cliente;
import enumsJava.entities.Order;
import enumsJava.entities.OrderItems;
import enumsJava.entities.Product;
import enumsJava.entities.enums.OrderStatus;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter ldf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birthdate: ");
        String input = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(input,ldf);

        Cliente cliente = new Cliente(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        LocalDate moment = LocalDate.now();

        Order order = new Order(moment,status,cliente);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++ ) {
            System.out.println("Enter #" + i + " item data: ");
            sc.nextLine();
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName,productPrice);

            OrderItems it = new OrderItems(productQuantity,product,productPrice);

            order.addItem(it);
        }
        System.out.println();
        System.out.println(order);

        sc.close();


    }
}
