package section3_lsp;

/**
 * Section 3 - Subsection 4: FixedDepositAccount
 * Extends Account, but does NOT implement Withdrawable since FDs do not support arbitrary withdrawals.
 * This completely satisfies LSP.
 */
public class FixedDepositAccount extends Account {
    public FixedDepositAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }
    // No withdraw method! FixedDepositAccount only exposes operations it genuinely supports.
}
