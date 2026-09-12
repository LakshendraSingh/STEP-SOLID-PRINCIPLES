package section4_isp_dip;

/**
 * Section 4 - Subsection 2: SavingsAccount implementing specific capability interfaces
 */
public class SavingsAccount implements Depositable, Withdrawable, Transferable, StatementProvider {
    private final int accountNumber;
    private final String accountHolder;
    private double balance;

    public SavingsAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("SavingsAccount #" + accountNumber + ": Deposited Rs. " + amount + ". New Balance: Rs. " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount #" + accountNumber + ": Withdrew Rs. " + amount + ". New Balance: Rs. " + balance);
        } else {
            System.out.println("SavingsAccount #" + accountNumber + ": Insufficient funds for withdrawal of Rs. " + amount);
        }
    }

    @Override
    public void transfer(double amount, String toAccount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("SavingsAccount #" + accountNumber + ": Transferred Rs. " + amount + " to " + toAccount + ". Remaining Balance: Rs. " + balance);
        } else {
            System.out.println("SavingsAccount #" + accountNumber + ": Transfer failed due to insufficient funds.");
        }
    }

    @Override
    public void printStatement() {
        System.out.println("=== Statement for Account #" + accountNumber + " (" + accountHolder + ") ===");
        System.out.println("Balance: Rs. " + balance);
        System.out.println("===========================================");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
