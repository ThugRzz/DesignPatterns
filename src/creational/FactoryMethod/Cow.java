package creational.FactoryMethod;

public class Cow implements Animal {
    @Override
    public void voice() {
        System.out.println("Moo moo!");
    }
}
