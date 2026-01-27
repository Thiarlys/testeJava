package herancaEPolimorfismo.entities;

public class Account {
    private Integer id;
    private String name;
    protected Double balance;

    public Account(){
    }
    public Account(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public Double getBalance() {
        return balance;
    }

    public void saque(Double valor) {
        if (valor != null && valor <= balance) {
            balance -= valor;
            System.out.println("Transaction completed. ");
        }
        else {
            System.out.println("Error processing request. Please try again.");
        }
    }

    public void deposito(Double valor) {
            balance += valor;
            System.out.println("Transaction completed. ");

    }


}
