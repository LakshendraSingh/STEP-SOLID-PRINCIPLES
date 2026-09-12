package section3_lsp;

/**
 * Section 3 - Subsection 3: FixedDepositAccount extending Account and throwing UnsupportedOperationException
 * This violates LSP because client code expecting Account.withdraw() to work will crash.
 */
public class FixedDepositAccount extends Account {
    public FixedDepositAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal is impossible: Fixed Deposit accounts cannot be withdrawn early!");
    }
}
