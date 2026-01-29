package enumsJava.entities;

import enumsJava.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate moment;
    private List<OrderItems> items = new ArrayList<OrderItems>();
    private OrderStatus status;

    private Cliente cliente;

    public Order() {
    }

    public Order(LocalDate moment,OrderStatus status, Cliente cliente) {
        super();
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItems item) {
        items.add(item);
    }
    public void removeItem(OrderItems item) {
        items.remove(item);
    }

    public Double valorTotal() {
        double valor = 0;
        for (OrderItems i : items) {
            valor += i.subTotal();
        }
        return valor;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment.format(dtf) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: " + "\n");
        sb.append(cliente + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItems i : items){
            sb.append(i + "\n");
        }
        sb.append("Total price: " + "\n");
        sb.append(String.format("%.2f",valorTotal()));

        return sb.toString();
    }


}
