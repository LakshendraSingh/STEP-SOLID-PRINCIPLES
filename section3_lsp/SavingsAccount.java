package section3_lsp;

public class SavingsAccount extends Account implements Withdrawable {
    public SavingsAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount (#" + accountNumber + " - " + name + "): Withdrew Rs. " + amount + ". Remaining balance: Rs. " + balance);
        } else {
            System.out.println("SavingsAccount (#" + accountNumber + " - " + name + "): Insufficient balance for withdrawal of Rs. " + amount);
        }
    }
}
