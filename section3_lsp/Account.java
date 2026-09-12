package section3_lsp;

/**
 * Section 3 - Subsection 3: Base Account class assuming all accounts are withdrawable
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

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
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
