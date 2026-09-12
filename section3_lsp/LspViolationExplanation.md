# Section 3.2 — Why Square/Rectangle Breaks LSP

## Explanation:
The `Square`/`Rectangle` hierarchy breaks the Liskov Substitution Principle because calling code written against `Rectangle` assumes that setting the width and setting the height are completely independent operations with separate state changes. `Square` fundamentally violates this behavioral invariant because mutating its height implicitly mutates its width (and vice versa) to preserve geometric equality. Consequently, substituting a `Square` where a `Rectangle` is expected alters observable behavior and causes unexpected side effects such as calculating an incorrect area (400 instead of 200).
