package behavioral.State;

public class Sleeping implements State {
    @Override
    public void state() {
        System.out.println("Sleeping...");
    }
}
