package section4_isp_dip;

/**
 * Section 4 - Subsection 4: Main Integration Demo
 * Proves that swapping between InMemoryAccountRepository and FileAccountRepository
 * requires editing only the single repository instantiation line in Main — Bank.java requires ZERO edits.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Section 4 (ISP + DIP) Complete Demonstration ===");

        // 1. Common Notification Service abstraction
        NotificationService notificationService = new EmailNotificationService();

        // 2. Swappable Repository Implementations (DIP)
        // Switch between InMemoryAccountRepository and FileAccountRepository seamlessly:
        System.out.println("\n--- Step A: Running Bank with InMemoryAccountRepository ---");
        AccountRepository memoryRepo = new InMemoryAccountRepository();
        Bank bankWithMemory = new Bank(memoryRepo, notificationService);

        bankWithMemory.openAccount(401, "David Miller", 15000.0);
        bankWithMemory.deposit(401, 3000.0);
        bankWithMemory.withdraw(401, 2000.0);

        System.out.println("\n--- Step B: Running Bank with FileAccountRepository (Bank.java needs ZERO edits) ---");
        AccountRepository fileRepo = new FileAccountRepository("accounts_storage.txt");
        Bank bankWithFile = new Bank(fileRepo, notificationService);

        bankWithFile.openAccount(402, "Emma Watson", 25000.0);
        bankWithFile.deposit(402, 5000.0);
        bankWithFile.withdraw(402, 4000.0);

        // 3. Interface Segregation demonstration with ATM and SavingsAccount
        System.out.println("\n--- Step C: Interface Segregation Principle (ISP) in action ---");
        ATM atm = new ATM();
        atm.deposit(1000.0);
        atm.withdraw(500.0);

        SavingsAccount savings = new SavingsAccount(403, "Frank Castle", 8000.0);
        savings.deposit(2000.0);
        savings.withdraw(1000.0);
        savings.transfer(500.0, "Account #402");
        savings.printStatement();
    }
}
