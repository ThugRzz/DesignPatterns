package creational.Builder.PizzaSample;

public class PizzaRunner {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        director.setBuilder(pepperoniPizzaBuilder);
        director.constructPizza();
        Pizza pizza = director.getPizza();
        System.out.println(pizza);
    }
}
