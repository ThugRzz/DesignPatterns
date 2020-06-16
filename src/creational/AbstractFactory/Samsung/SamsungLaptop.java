package creational.AbstractFactory.Samsung;

import creational.AbstractFactory.Laptop;

public class SamsungLaptop implements Laptop {
    @Override
    public void laptopModel() {
        System.out.println("This is Samsung laptop!");
    }
}
