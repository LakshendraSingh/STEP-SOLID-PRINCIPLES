package section2_ocp;

/**
 * Section 2 - Subsection 3: Current Interest Policy (1%)
 */
public class CurrentInterestPolicy implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return balance * 0.01;
    }
}
