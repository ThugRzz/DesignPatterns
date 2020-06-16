package creational.Builder.PizzaSample;

public class PepperoniPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("spicy");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+olive");
    }
}
