package creational.AbstractFactory.Apple;

import creational.AbstractFactory.Laptop;

public class Macbook implements Laptop {
    @Override
    public void laptopModel() {
        System.out.println("This is macbook!");
    }
}
