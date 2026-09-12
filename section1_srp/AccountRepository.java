package section1_srp;

/**
 * Section 1 - Subsection 3: AccountRepository
 * Dedicated class solely responsible for database persistence of BankAccount.
 */
public class AccountRepository {
    public void save(BankAccount account) {
        System.out.println("Saving account to database: Account #" + account.getAccountNumber() + " with balance " + account.getBalance());
    }
}
