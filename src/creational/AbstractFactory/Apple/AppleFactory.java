package creational.AbstractFactory.Apple;

import creational.AbstractFactory.Laptop;
import creational.AbstractFactory.Phone;
import creational.AbstractFactory.TechniqueFactory;

public class AppleFactory implements TechniqueFactory {
    @Override
    public Phone getPhoneModel() {
        return new Iphone();
    }

    @Override
    public Laptop getLaptopModel() {
        return new Macbook();
    }
}
