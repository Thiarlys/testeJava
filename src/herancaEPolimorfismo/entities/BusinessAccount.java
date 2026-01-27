package herancaEPolimorfismo.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }
    public BusinessAccount(Integer id, String name, Double balance, Double loanLimit) {
        super(id,name,balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit(){
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double loanValue) {
        if (loanValue != null && loanValue <= loanLimit) {
            balance += loanValue;
            System.out.println("Transaction completed. ");
        }else {
            System.out.println("Error processing request. Please try again. ");
        }
    }
}
