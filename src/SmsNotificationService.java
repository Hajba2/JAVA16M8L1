public class SmsNotificationService implements SmsNotification {

    @Override
    public void send(String text) {
        // some http request
        System.out.println("msg sent : " + text);
    }

}
