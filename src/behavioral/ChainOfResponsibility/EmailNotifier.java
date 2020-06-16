package behavioral.ChainOfResponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sent email notify with message: "+message);
    }
}
