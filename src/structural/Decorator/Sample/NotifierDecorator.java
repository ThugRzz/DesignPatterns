package structural.Decorator.Sample;

public class NotifierDecorator implements Notifier {
    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String sendNotify() {
        return "message";
    }
}
