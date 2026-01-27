package herancaEPolimorfismo.aplication;

import herancaEPolimorfismo.entities.Account;
import herancaEPolimorfismo.entities.BusinessAccount;
import herancaEPolimorfismo.entities.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(123,"Thiarllys",1000.00);
        BusinessAccount bcc = new BusinessAccount(122, "Carla", 1000.00, 1000.00);
        SavingAccount scc = new SavingAccount(333,"Catarina", 1000.00,0.01);

        //Upcasting
        Account acc = bcc;
        Account acc2 = new BusinessAccount();
        Account acc3 = new SavingAccount(222,"Tuica",1000.00,1000.00);

        //Downcasting
        BusinessAccount bcc1 = (BusinessAccount) acc2; //Downcast manual
        SavingAccount scc1 = (SavingAccount) acc3;

        //Usando instanceof para verificar se o downcast é possível
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bcc2 = (BusinessAccount) acc3;
            bcc2.loan(1000.00);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingAccount) {
            SavingAccount scc2 = (SavingAccount) acc3;
            scc2.updateBalance();
            System.out.println("Balance updated.");
        }
    }
}
