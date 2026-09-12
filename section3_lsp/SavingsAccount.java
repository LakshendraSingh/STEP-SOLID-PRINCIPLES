package section3_lsp;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount: Successfully withdrew Rs. " + amount + ". New balance: Rs. " + balance);
        }
    }
}
