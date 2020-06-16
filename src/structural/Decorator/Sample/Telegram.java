package structural.Decorator.Sample;

public class Telegram extends NotifierDecorator {
    public Telegram(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String sendNotify() {
        return super.sendNotify()+" with telegram";
    }
}
