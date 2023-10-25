public class StudentSchoolDataValidator implements StudentValidator, SmsNotification {

    private SmsNotificationService smsNotificationService = new SmsNotificationService();

    @Override
    public boolean validate(Student student) {
        smsNotificationService.send("you sre valid");
        return true;
    }

    @Override
    public void send(String text) {
        smsNotificationService.send("message from student data validation process is :" + text);
    }
}
