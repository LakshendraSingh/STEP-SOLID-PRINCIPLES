package section2_ocp;

/**
 * Section 2 - Subsection 4: Salary Interest Policy (5%)
 * Added as an extension without modifying any existing interest policy classes.
 */
public class SalaryInterestPolicy implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return balance * 0.05;
    }
}
