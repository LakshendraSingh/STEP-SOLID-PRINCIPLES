package section2_ocp;

/**
 * Section 2 - Subsection 3: Main demonstrating OCP calculation via Strategy pattern
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Section 2 (OCP) - Subsection 3 Demonstration ---");
        
        double savingsBalance = 10000.0;
        double currentBalance = 50000.0;

        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();

        System.out.println("Savings Account Interest (4% on " + savingsBalance + "): Rs. " + savingsPolicy.calculate(savingsBalance));
        System.out.println("Current Account Interest (1% on " + currentBalance + "): Rs. " + currentPolicy.calculate(currentBalance));
    }
}
