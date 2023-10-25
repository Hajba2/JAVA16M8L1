public class ColledgeDataValidator implements StudentValidator {

    private SmsNotificationService smsNotificationService;

    @Override
    public boolean validate(Student student) {
        return true;
    }


}
