package section3_lsp;

/**
 * Section 3 - Subsection 4: Account base abstraction
 * Does NOT contain withdraw(), adhering to LSP and ISP.
 */
public class Account {
    protected final int accountNumber;
    protected final String name;
    protected double balance;

    public Account(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
