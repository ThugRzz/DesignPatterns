package creational.AbstractFactory.Samsung;

import creational.AbstractFactory.Phone;

public class Galaxy implements Phone {
    @Override
    public void phoneModel() {
        System.out.println("This is Samsung Galaxy phone!");
    }
}
