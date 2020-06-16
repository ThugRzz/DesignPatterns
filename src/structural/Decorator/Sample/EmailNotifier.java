package structural.Decorator.Sample;

public class EmailNotifier implements Notifier {
    @Override
    public String sendNotify() {
        return "message";
    }
}
