package behavioral.State;

public class DeveloperDay {
    public static void main(String[] args) {
        State currentState = new Sleeping();
        Developer developer = new Developer(currentState);
        developer.doing();
        developer.changeState();
        developer.doing();
        for(int i = 0; i<10; i++){
            developer.changeState();
            developer.doing();
        }
    }
}
