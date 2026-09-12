package section4_isp_dip;

import java.util.Optional;

/**
 * Section 4 - Subsection 3 & 4: AccountRepository interface (DIP Abstraction)
 */
public interface AccountRepository {
    void save(Account account);
    Optional<Account> find(int accountNumber);
}
