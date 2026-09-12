package section2_ocp;

/**
 * Section 2 - Subsection 3: Savings Interest Policy (4%)
 */
public class SavingsInterestPolicy implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return balance * 0.04;
    }
}
