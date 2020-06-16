package creational.AbstractFactory.Samsung;


import creational.AbstractFactory.Laptop;
import creational.AbstractFactory.Phone;
import creational.AbstractFactory.TechniqueFactory;

public class SamsungFactory implements TechniqueFactory {
    @Override
    public Phone getPhoneModel() {
        return new Galaxy();
    }

    @Override
    public Laptop getLaptopModel() {
        return new SamsungLaptop();
    }
}
