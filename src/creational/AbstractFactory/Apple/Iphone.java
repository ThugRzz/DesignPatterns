package creational.AbstractFactory.Apple;

import creational.AbstractFactory.Phone;

public class Iphone implements Phone {

    @Override
    public void phoneModel() {
        System.out.println("This is Iphone!");
    }
}
