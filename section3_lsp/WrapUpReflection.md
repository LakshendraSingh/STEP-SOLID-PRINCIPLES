# Section 3.5 — Wrap-up Reflection

## Reflection: Why Throwing an Exception Violates LSP
Making `FixedDepositAccount` implement `Withdrawable` and throwing an exception is a severe violation of the Liskov Substitution Principle (LSP). 

LSP dictates that objects of a subtype must be completely substitutable for objects of their base type/interface without altering program correctness or breaking client expectations. When a client interacts with a `Withdrawable` interface reference, it relies on the behavioral postcondition and contract that calling `withdraw()` is a supported business operation. Forcing an unsupported class to implement that interface just to satisfy the Java compiler introduces unexpected runtime runtime crashes (`UnsupportedOperationException`), thereby destroying type safety and violating substitutability.
