package creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalByName("dog");
        Animal animal = animalFactory.createAnimal();
        animal.voice();
    }

    static AnimalFactory createAnimalByName(String s) {
        if (s.equalsIgnoreCase("cat")) {
            return new CatFactory();
        } else if (s.equalsIgnoreCase("dog")) {
            return new DogFactory();
        } else if (s.equalsIgnoreCase("cow")) {
            return new CowFactory();
        } else {
            throw new RuntimeException(s + " animal is unknown");
        }
    }
}
