package section1_srp;

/**
 * Section 1 - Subsection 4: Main integration class
 * Demonstrates combining BankAccount, AccountRepository, NotificationService, and StatementGenerator.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Section 1 (SRP) Demonstration ---");
        
        // 1. Create account
        BankAccount account = new BankAccount(1001, "Alice Sharma", 5000.0);
        AccountRepository repository = new AccountRepository();
        NotificationService notificationService = new NotificationService();
        StatementGenerator statementGenerator = new StatementGenerator();

        repository.save(account);
        notificationService.send("Account created for " + account.getAccountHolder() + " with initial balance: Rs. " + account.getBalance());

        // 2. Deposit operation
        account.deposit(2500.0);
        notificationService.send("Deposited Rs. 2500.0. Updated Balance: Rs. " + account.getBalance());

        // 3. Withdraw operation
        boolean withdrawn = account.withdraw(1200.0);
        if (withdrawn) {
            notificationService.send("Withdrawn Rs. 1200.0. Updated Balance: Rs. " + account.getBalance());
        }

        // 4. Save updated state
        repository.save(account);

        // 5. Generate and print statement
        String statement = statementGenerator.generate(account);
        System.out.println("\n" + statement);
    }
}
