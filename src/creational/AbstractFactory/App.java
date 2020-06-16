package creational.AbstractFactory;

public class App {
    private Phone phone;
    private Laptop laptop;

    public App(TechniqueFactory factory){
        phone=factory.getPhoneModel();
        laptop=factory.getLaptopModel();
    }

    public void model(){
        phone.phoneModel();
        laptop.laptopModel();
    }
}
