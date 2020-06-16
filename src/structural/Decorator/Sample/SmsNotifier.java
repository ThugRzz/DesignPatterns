package structural.Decorator.Sample;

public class SmsNotifier extends NotifierDecorator {
    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendNotify() {
        return super.sendNotify()+" with sms";
    }
}
