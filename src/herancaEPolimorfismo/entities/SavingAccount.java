package herancaEPolimorfismo.entities;

public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount() {
        super();
    }
    public SavingAccount(Integer id, String name, Double balance, Double interestRate) {
        super(id, name, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
