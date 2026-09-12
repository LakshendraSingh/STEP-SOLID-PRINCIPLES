# Section 1.5 — Wrap-up Reflection

## Reflection:
We ended up with **4 distinct classes** (`BankAccount`, `AccountRepository`, `NotificationService`, and `StatementGenerator`), in addition to `Main`. 

This design is vastly easier to test because each class now has a single, isolated concern with no side-effects leaking into unrelated domains. For example, `BankAccount`'s core business logic (deposits and withdrawals) can be unit-tested purely in memory without spinning up a database connection or configuring an SMTP mail server. Furthermore, testing statement formatting or notification logic no longer requires setting up complex account transaction states, reducing mock overhead and eliminating cascading test failures when one subsystem changes.
