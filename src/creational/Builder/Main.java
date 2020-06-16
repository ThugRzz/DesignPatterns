package creational.Builder;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new IphoneBuilder());
        Phone phone = director.buildPhone();
        System.out.println(phone);
    }
}
