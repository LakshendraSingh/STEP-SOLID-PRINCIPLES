# STEP — SOLID Principles in Java

This repository contains the complete step-by-step implementation of all four sections and subsections from the **SOLID Principles in Java — Designing Enterprise-Level Banking Systems** curriculum.

---

## Repository Structure & Section Overview

### 1. [Section 1 — Single Responsibility Principle (SRP)](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp)
- **Scenario**: Refactoring a bloated monolithic `BankAccount` handling deposits, database saving, emails, statements, and tax.
- **1.1 (Warm-up)**: [MessyBankAccount.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/MessyBankAccount.java) with explicit comments identifying 5 reasons to change.
- **1.2 (Warm-up)**: [BankAccountJobDescription.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/BankAccountJobDescription.md) defining single-responsibility job scope.
- **1.3 (Core)**: Extracted [AccountRepository.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/AccountRepository.java) and [NotificationService.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/NotificationService.java); cleaned [BankAccount.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/BankAccount.java).
- **1.4 (Core)**: Extracted [StatementGenerator.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/StatementGenerator.java) and implemented [Main.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/Main.java) integration.
- **1.5 (Wrap-up)**: [WrapUpReflection.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section1_srp/WrapUpReflection.md) analyzing testability and modularity gains.

---

### 2. [Section 2 — Open/Closed Principle (OCP)](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp)
- **Scenario**: Adding support for new account types and interest policies without modifying tested code.
- **2.1 (Warm-up)**: [MessyInterestCalculator.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/MessyInterestCalculator.java) documenting why `if/else` chains violate OCP.
- **2.2 (Warm-up)**: [InterestPolicy.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/InterestPolicy.java) interface abstraction.
- **2.3 (Core)**: [SavingsInterestPolicy.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/SavingsInterestPolicy.java) (4%) and [CurrentInterestPolicy.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/CurrentInterestPolicy.java) (1%) via Strategy Pattern.
- **2.4 (Core)**: Added [SalaryAccount.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/SalaryAccount.java) & [SalaryInterestPolicy.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/SalaryInterestPolicy.java) (5%) and constructor-injected [NotificationService.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/NotificationService.java) in [Bank.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/Bank.java).
- **2.5 (Wrap-up)**: [WrapUpReflection.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section2_ocp/WrapUpReflection.md) confirming zero modifications to existing policy classes.

---

### 3. [Section 3 — Liskov Substitution Principle (LSP)](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp)
- **Scenario**: Preventing runtime errors when Fixed Deposit accounts cannot support arbitrary withdrawals.
- **3.1 (Warm-up)**: [RectangleSquareDemo.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/RectangleSquareDemo.java) showing classic Rectangle/Square calculation defect (400 vs 200).
- **3.2 (Warm-up)**: [LspViolationExplanation.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/LspViolationExplanation.md) on broken behavioral invariants.
- **3.3 (Core)**: [LspCrashDemo.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/LspCrashDemo.java) reproducing `UnsupportedOperationException` when calling `withdraw()` on `List<Account>`.
- **3.4 (Core)**: Segregated withdrawal behavior into [Withdrawable.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/Withdrawable.java) and demonstrated type-safe iteration in [LspFixedDemo.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/LspFixedDemo.java).
- **3.5 (Wrap-up)**: [WrapUpReflection.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section3_lsp/WrapUpReflection.md) detailing why throwing exceptions in sub-classes breaks substitutability.

---

### 4. [Section 4 — Interface Segregation Principle (ISP) + Dependency Inversion Principle (DIP)](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip)
- **Scenario**: Refactoring fat ATM service contracts and decoupling database storage backends from high-level bank services.
- **4.1 (Warm-up)**: [FatBankService.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/FatBankService.java) & [FatATM.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/FatATM.java) showing forced/unneeded methods.
- **4.2 (Core - ISP)**: Segregated interfaces ([Depositable.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/Depositable.java), [Withdrawable.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/Withdrawable.java), [Transferable.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/Transferable.java), [StatementProvider.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/StatementProvider.java), [LoanEligible.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/LoanEligible.java)) implemented cleanly by [ATM.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/ATM.java) and [SavingsAccount.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/SavingsAccount.java).
- **4.3 (Warm-up - DIP)**: Decoupled [Bank.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/Bank.java) to depend purely on [AccountRepository.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/AccountRepository.java) and [NotificationService.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/NotificationService.java) abstractions.
- **4.4 (Core - DIP)**: Implemented [FileAccountRepository.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/FileAccountRepository.java) and swapped into [Main.java](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/Main.java) with zero modifications to `Bank.java`.
- **4.5 (Wrap-up)**: [WrapUpReflection.md](file:///Users/lakshendra_singh/Code/BTech/Step_V/SOLID-Principles/section4_isp_dip/WrapUpReflection.md) reflecting on enterprise maintainability, loose coupling, and extension.

---

## Compilation & Execution
To compile and run any section:
```bash
# Section 1
javac section1_srp/*.java && java section1_srp.Main

# Section 2
javac section2_ocp/*.java && java section2_ocp.Main

# Section 3
javac section3_lsp/*.java && java section3_lsp.RectangleSquareDemo && java section3_lsp.LspFixedDemo

# Section 4
javac section4_isp_dip/*.java && java section4_isp_dip.Main
```
