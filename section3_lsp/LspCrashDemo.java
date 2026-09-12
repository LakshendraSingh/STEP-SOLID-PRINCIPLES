package section3_lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * Section 3 - Subsection 3: Loop calling withdraw() on List<Account> and reporting crash
 */
public class LspCrashDemo {
    public static void main(String[] args) {
        System.out.println("--- Section 3 - Subsection 3: Demonstrating LSP Crash on List<Account> ---");

        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(301, "Alice", 5000.0));
        accounts.add(new FixedDepositAccount(302, "Bob", 50000.0));

        for (Account account : accounts) {
            try {
                System.out.println("Attempting withdrawal of Rs. 1000 from account #" + account.getAccountNumber() + " (" + account.getClass().getSimpleName() + ")...");
                account.withdraw(1000.0);
            } catch (UnsupportedOperationException e) {
                System.err.println("CRASH / EXCEPTION OBSERVED: " + e.getMessage());
                System.err.println("Reason: " + account.getClass().getSimpleName() + " violated the superclass Account contract!");
            }
        }
    }
}
