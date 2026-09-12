package section2_ocp;

/**
 * Section 2 - Subsection 2: InterestPolicy Interface (OCP Abstraction)
 * Defines the contract for interest calculation algorithms.
 */
public interface InterestPolicy {
    double calculate(double balance);
}
