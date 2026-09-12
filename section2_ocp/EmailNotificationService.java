package section2_ocp;

/**
 * Section 2 - Subsection 4: EmailNotificationService
 */
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("EMAIL → " + recipient + ": " + message);
    }
}
