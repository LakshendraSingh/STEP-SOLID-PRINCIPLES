package section2_ocp;

/**
 * Section 2 - Subsection 4: Main demonstrating OCP
 * Shows adding SalaryAccount & SalaryInterestPolicy without modifying existing policies,
 * and swapping NotificationService from Email to SMS without touching Bank internals.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Section 2 (OCP) Complete Demonstration ===");
        
        // 1. Existing Account Types and Policies
        Account savings = new SavingsAccount(201, "Bob Smith", 10000.0);
        Account current = new CurrentAccount(202, "Global Tech Corp", 50000.0);

        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();

        System.out.println("Savings Interest (4%): Rs. " + savingsPolicy.calculate(savings.getBalance()));
        System.out.println("Current Interest (1%): Rs. " + currentPolicy.calculate(current.getBalance()));

        // 2. Newly added SalaryAccount and SalaryInterestPolicy (OCP - Zero changes to existing policy classes)
        Account salary = new SalaryAccount(203, "Charlie Davis", 20000.0);
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();
        System.out.println("Salary Interest (5%): Rs. " + salaryPolicy.calculate(salary.getBalance()));

        // 3. Notification Service pluggability (Email -> SMS) without modifying Bank internals
        System.out.println("\n--- Testing Bank with Email Notification ---");
        NotificationService emailService = new EmailNotificationService();
        Bank bankWithEmail = new Bank(emailService);
        bankWithEmail.processDeposit(salary, 5000.0);

        System.out.println("\n--- Testing Bank with Swapped SMS Notification (Bank unmodified) ---");
        NotificationService smsService = new SMSNotificationService();
        Bank bankWithSms = new Bank(smsService);
        bankWithSms.processWithdrawal(salary, 3000.0);
    }
}
