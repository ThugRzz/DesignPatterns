package creational.Builder.PizzaSample;

public class Director {
    private PizzaBuilder builder;
    public void setBuilder(PizzaBuilder builder){ this.builder=builder;}
    public Pizza getPizza(){return builder.getPizza();}
    public void constructPizza(){
        builder.createPizza();
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
    }
}
