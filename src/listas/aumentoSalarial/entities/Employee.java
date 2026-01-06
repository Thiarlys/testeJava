package listas.aumentoSalarial.entities;

import java.text.Format;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void aumentoSalarial(Integer percent) {
        this.salary += salary * percent / 100.0;
    }

    public String toString() {
        return "id : " + id + " , nome: " + name + ", salario: R$" + String.format("%.2f",salary);
    }
}
