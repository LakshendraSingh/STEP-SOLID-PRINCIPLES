package section4_isp_dip;

import java.util.Optional;

/**
 * Section 4 - Subsection 3: Bank class adhering to Dependency Inversion Principle (DIP).
 * 
 * High-level module (Bank) depends purely on abstractions (AccountRepository, NotificationService),
 * NOT on low-level concrete classes (e.g., InMemoryAccountRepository, FileAccountRepository, MySQLDatabase).
 */
public class Bank {
    // Abstraction fields (DIP) - no concrete repository or notification dependencies
    private final AccountRepository repository;
    private final NotificationService notificationService;

    // Constructor Injection: dependencies are supplied from outside
    public Bank(AccountRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public Account openAccount(int accountNumber, String name, double initialBalance) {
        Account account = new Account(accountNumber, name, initialBalance);
        repository.save(account);
        notificationService.send(name, "Welcome to the Bank! Account #" + accountNumber + " opened with Rs. " + initialBalance);
        return account;
    }

    public boolean deposit(int accountNumber, double amount) {
        Optional<Account> maybeAccount = repository.find(accountNumber);
        if (maybeAccount.isEmpty()) {
            System.err.println("Bank: Account #" + accountNumber + " not found!");
            return false;
        }

        Account account = maybeAccount.get();
        account.deposit(amount);
        repository.save(account);
        notificationService.send(account.getName(), "Deposited Rs. " + amount + ". New Balance: Rs. " + account.getBalance());
        return true;
    }

    public boolean withdraw(int accountNumber, double amount) {
        Optional<Account> maybeAccount = repository.find(accountNumber);
        if (maybeAccount.isEmpty()) {
            System.err.println("Bank: Account #" + accountNumber + " not found!");
            return false;
        }

        Account account = maybeAccount.get();
        boolean success = account.withdraw(amount);
        if (success) {
            repository.save(account);
            notificationService.send(account.getName(), "Withdrawn Rs. " + amount + ". New Balance: Rs. " + account.getBalance());
        } else {
            notificationService.send(account.getName(), "Withdrawal failed: insufficient balance.");
        }
        return success;
    }
}
