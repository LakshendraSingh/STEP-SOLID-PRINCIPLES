package section2_ocp;

/**
 * Section 2 - Subsection 1: (Warm-up) Messy InterestCalculator with if/else chain
 * 
 * Prediction of what code needs to be touched to add a 4th account type (e.g., "FixedDeposit" or "SeniorCitizen"):
 * 1. Method affected: calculate(String accountType, double balance)
 * 2. Lines affected: We must modify the core if-else conditional chain inside calculate() by adding an `else if (accountType.equals("FixedDeposit")) { return balance * 0.07; }` branch before the fallback return.
 * 3. Constant/Enum changes: Any account type validation constants/strings would also need modification.
 * 4. Risk: Every addition requires reopening and modifying this shared, tested file, which risks regression bugs, unintended syntax/logic breaks, and merge conflicts across different teams.
 */
public class MessyInterestCalculator {
    public double calculate(String accountType, double balance) {
        if (accountType.equalsIgnoreCase("Savings")) {
            return balance * 0.04;
        } else if (accountType.equalsIgnoreCase("Current")) {
            return balance * 0.01;
        } else if (accountType.equalsIgnoreCase("Salary")) {
            return balance * 0.05;
        }
        return 0.0;
    }
}
