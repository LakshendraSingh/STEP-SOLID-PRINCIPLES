package section3_lsp;

import java.util.ArrayList;
import java.util.List;

/**
 * Section 3 - Subsection 3: Demonstrating how a flawed inheritance design crashes at runtime.
 */
public class LspCrashDemo {

    // Flawed base class that assumes all accounts can withdraw
    static class FlawedAccount {
        protected int accountNumber;
        protected String name;
        protected double balance;

        public FlawedAccount(int accountNumber, String name, double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            }
        }

        public int getAccountNumber() { return accountNumber; }
        public String getName() { return name; }
        public double getBalance() { return balance; }
    }

    static class FlawedSavingsAccount extends FlawedAccount {
        public FlawedSavingsAccount(int accountNumber, String name, double balance) {
            super(accountNumber, name, balance);
        }

        @Override
        public void withdraw(double amount) {
            super.withdraw(amount);
            System.out.println("SavingsAccount: Successfully withdrew Rs. " + amount);
        }
    }

    static class FlawedFixedDepositAccount extends FlawedAccount {
        public FlawedFixedDepositAccount(int accountNumber, String name, double balance) {
            super(accountNumber, name, balance);
        }

        @Override
        public void withdraw(double amount) {
            throw new UnsupportedOperationException("Withdrawal is impossible: Fixed Deposit accounts cannot be withdrawn early!");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Section 3 - Subsection 3: Demonstrating LSP Crash on List<FlawedAccount> ---");

        List<FlawedAccount> accounts = new ArrayList<>();
        accounts.add(new FlawedSavingsAccount(301, "Alice", 5000.0));
        accounts.add(new FlawedFixedDepositAccount(302, "Bob", 50000.0));

        for (FlawedAccount account : accounts) {
            try {
                System.out.println("Attempting withdrawal of Rs. 1000 from account #" + account.getAccountNumber() + " (" + account.getClass().getSimpleName() + ")...");
                account.withdraw(1000.0);
            } catch (UnsupportedOperationException e) {
                System.err.println("CRASH / EXCEPTION OBSERVED: " + e.getMessage());
                System.err.println("Reason: " + account.getClass().getSimpleName() + " violated the superclass FlawedAccount contract!");
            }
        }
    }
}
