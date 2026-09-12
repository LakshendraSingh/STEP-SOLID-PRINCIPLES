package section2_ocp;

/**
 * Section 2 - Subsection 4: Bank accepting NotificationService abstraction.
 * Adding a new NotificationService (e.g. SMSNotificationService) requires ZERO changes to Bank internals.
 */
public class Bank {
    private final NotificationService notificationService;

    public Bank(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processDeposit(Account account, double amount) {
        account.deposit(amount);
        notificationService.send(account.getAccountHolder(), "Deposited Rs. " + amount + ". New Balance: Rs. " + account.getBalance());
    }

    public void processWithdrawal(Account account, double amount) {
        boolean success = account.withdraw(amount);
        if (success) {
            notificationService.send(account.getAccountHolder(), "Withdrawn Rs. " + amount + ". New Balance: Rs. " + account.getBalance());
        } else {
            notificationService.send(account.getAccountHolder(), "Withdrawal of Rs. " + amount + " failed due to insufficient funds.");
        }
    }
}
