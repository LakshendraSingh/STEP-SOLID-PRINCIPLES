package section4_isp_dip;

/**
 * Section 4: EmailNotificationService implementation
 */
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("EMAIL → " + recipient + ": " + message);
    }
}
