package structural.Decorator.Sample;

public class Application {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        System.out.println(notifier.sendNotify());
        notifier = new SmsNotifier(notifier);
        System.out.println(notifier.sendNotify());
        notifier = new Telegram(notifier);
        System.out.println(notifier.sendNotify());
    }
}
