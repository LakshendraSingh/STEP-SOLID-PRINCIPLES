package section3_lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * Section 3 - Subsection 4: Correct LSP Demonstration
 * Iterates over List<Withdrawable> for withdrawals. FixedDepositAccount is never asked to do something it cannot do.
 */
public class LspFixedDemo {
    public static void main(String[] args) {
        System.out.println("--- Section 3 - Subsection 4: LSP-Compliant Design Demo ---");

        // 1. Heterogeneous accounts list for generic account operations (e.g. deposit, view balance)
        List<Account> allAccounts = new ArrayList<>();
        allAccounts.add(new SavingsAccount(301, "Alice", 5000.0));
        allAccounts.add(new CurrentAccount(302, "Bob Corp", 25000.0));
        allAccounts.add(new FixedDepositAccount(303, "Charlie", 100000.0));

        System.out.println("Processing deposits for all accounts:");
        for (Account acc : allAccounts) {
            acc.deposit(500.0);
            System.out.println("Account #" + acc.getAccountNumber() + " (" + acc.getName() + ") balance: Rs. " + acc.getBalance());
        }

        // 2. Withdrawable accounts list for withdrawal operations (Type-safe & LSP-compliant)
        System.out.println("\nProcessing withdrawals strictly for Withdrawable accounts:");
        List<Withdrawable> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add((Withdrawable) allAccounts.get(0)); // Alice Savings
        withdrawableAccounts.add((Withdrawable) allAccounts.get(1)); // Bob Current

        for (Withdrawable withdrawable : withdrawableAccounts) {
            withdrawable.withdraw(1500.0);
        }

        System.out.println("\nResult: FixedDepositAccount is protected by typing and never violates substitutability!");
    }
}
