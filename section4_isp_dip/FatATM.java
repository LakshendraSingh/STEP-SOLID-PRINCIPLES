package section4_isp_dip;

/**
 * Section 4 - Subsection 1: ATM implementing fat interface
 * Demonstrates forced/unneeded methods due to violation of Interface Segregation Principle (ISP).
 */
public class FatATM implements FatBankService {

    @Override
    public void deposit(double amount) {
        // [NEEDED] ATM hardware supports cash deposits
        System.out.println("ATM: Deposited Rs. " + amount);
    }

    @Override
    public void withdraw(double amount) {
        // [NEEDED] ATM hardware supports cash withdrawals
        System.out.println("ATM: Dispensed cash Rs. " + amount);
    }

    @Override
    public void transfer(double amount, String toAccount) {
        // [FORCED / OPTIONAL] ATM hardware might not support intra-bank wire transfers
        throw new UnsupportedOperationException("ATM cannot perform wire transfer!");
    }

    @Override
    public void printStatement() {
        // [FORCED / UNNEEDED] ATM hardware may not have a statement printer roll installed
        throw new UnsupportedOperationException("ATM does not support full statement printing!");
    }

    @Override
    public void applyForLoan() {
        // [FORCED / UNNEEDED] An ATM hardware terminal should never handle credit loan underwriting/applications!
        throw new UnsupportedOperationException("ATM does not support loan applications!");
    }
}
