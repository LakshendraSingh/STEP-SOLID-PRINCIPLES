package section3_lsp;

public class CurrentAccount extends Account implements Withdrawable {
    public CurrentAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("CurrentAccount (#" + accountNumber + " - " + name + "): Withdrew Rs. " + amount + ". Remaining balance: Rs. " + balance);
        } else {
            System.out.println("CurrentAccount (#" + accountNumber + " - " + name + "): Insufficient balance for withdrawal of Rs. " + amount);
        }
    }
}
