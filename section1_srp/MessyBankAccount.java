package section1_srp;

/**
 * Section 1 - Subsection 1: (Warm-up) Messy BankAccount class
 * 
 * Reasons to change (at least 4 distinct reasons):
 * 1. Changes if Database requirements or schema change (e.g., migrating from JDBC/Hibernate to NoSQL or changing SQL queries in saveToDatabase).
 * 2. Changes if Email provider or notification system changes (e.g., switching SMTP provider or moving to SMS/WhatsApp in sendEmail).
 * 3. Changes if Tax calculation rules change (e.g., tax rate changes or tax calculation logic updates in calculateTax).
 * 4. Changes if Statement formatting requirements change (e.g., changing layout, adding timestamps, or switching to PDF/HTML format in generateStatement).
 * 5. Changes if Core account business rules change (e.g., balance calculation, overdraft rules, deposit/withdrawal validation in deposit/withdraw).
 */
public class MessyBankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void saveToDatabase() {
        // JDBC / Hibernate logic here
        System.out.println("Saving account with balance " + balance + " to database via JDBC/Hibernate");
    }

    public void sendEmail() {
        // SMTP logic here
        System.out.println("Sending email notification for account with balance: " + balance);
    }

    public String generateStatement() {
        return "Statement: Current balance is " + balance;
    }

    public double calculateTax() {
        return balance * 0.1;
    }

    public double getBalance() {
        return balance;
    }
}
