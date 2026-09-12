package section4_isp_dip;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Section 4 - Subsection 3: InMemoryAccountRepository implementation
 */
public class InMemoryAccountRepository implements AccountRepository {
    private final Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void save(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("[InMemoryRepo] Saved account #" + account.getAccountNumber() + " (" + account.getName() + ")");
    }

    @Override
    public Optional<Account> find(int accountNumber) {
        return Optional.ofNullable(accounts.get(accountNumber));
    }
}
