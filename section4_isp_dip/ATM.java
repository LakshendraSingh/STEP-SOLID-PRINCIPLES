package section4_isp_dip;

/**
 * Section 4 - Subsection 2: ATM implementing only Depositable and Withdrawable.
 * Satisfies ISP by not being forced to implement unneeded methods.
 */
public class ATM implements Depositable, Withdrawable {

    @Override
    public void deposit(double amount) {
        System.out.println("ATM: Accepted cash deposit of Rs. " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ATM: Dispensed cash of Rs. " + amount);
    }
}
