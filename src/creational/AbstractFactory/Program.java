package creational.AbstractFactory;

import creational.AbstractFactory.Apple.AppleFactory;
import creational.AbstractFactory.Samsung.SamsungFactory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        App app = null;
        TechniqueFactory factory;
        String s = scan.next();
        if(s.equalsIgnoreCase("apple")){
            factory= new AppleFactory();
            app = new App(factory);
        }else if(s.equalsIgnoreCase("samsung")){
            factory=new SamsungFactory();
            app = new App(factory);
        }else {
            throw new RuntimeException("This factory is unknown");
        }
        App techniqueModels = app;
        techniqueModels.model();
    }
}
