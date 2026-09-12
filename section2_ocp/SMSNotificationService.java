package section2_ocp;

/**
 * Section 2 - Subsection 4: SMSNotificationService
 */
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS → " + recipient + ": " + message);
    }
}
