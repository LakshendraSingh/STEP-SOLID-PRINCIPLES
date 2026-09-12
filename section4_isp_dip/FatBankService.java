package section4_isp_dip;

/**
 * Section 4 - Subsection 1: (Warm-up) Fat Interface violating ISP
 */
public interface FatBankService {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, String toAccount);
    void printStatement();
    void applyForLoan();
}
