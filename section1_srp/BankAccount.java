package section1_srp;

/**
 * Section 1 - Subsection 3 & 4: SRP-compliant BankAccount
 * BankAccount now only handles account state and basic balance operations.
 */
public class BankAccount {
    private final int accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public BankAccount(double initialBalance) {
        this(101, "Customer", initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
