package section1_srp;

/**
 * Section 1 - Subsection 4: StatementGenerator
 * Dedicated class solely responsible for generating formatted statements.
 */
public class StatementGenerator {
    public String generate(BankAccount account) {
        return "=== Bank Statement ===\n" +
               "Account Number: " + account.getAccountNumber() + "\n" +
               "Account Holder: " + account.getAccountHolder() + "\n" +
               "Current Balance: Rs. " + account.getBalance() + "\n" +
               "======================";
    }
}
