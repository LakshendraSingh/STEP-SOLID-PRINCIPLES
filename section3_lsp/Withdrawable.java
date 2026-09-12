package section3_lsp;

/**
 * Section 3 - Subsection 4: Withdrawable interface
 * Segregates withdrawal behavior so only accounts that genuinely support withdrawal implement it.
 */
public interface Withdrawable {
    void withdraw(double amount);
}
