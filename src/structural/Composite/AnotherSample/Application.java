package structural.Composite.AnotherSample;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Giftbox largeBox = new Giftbox();
        List<Cookies> cookies = new ArrayList<Cookies>();
        cookies.add(new Cookies());
        cookies.add(new Cookies());
        Chocolate chocolate = new Chocolate();
        Drinks drinks = new Drinks();
        largeBox.addProduct(chocolate);
        largeBox.addProduct(drinks);
        largeBox.addProduct(cookies.get(0));
        largeBox.addProduct(cookies.get(1));
        largeBox.totalCost();
        System.out.println("````````````");
        largeBox.removeProduct(drinks);
        largeBox.removeProduct(chocolate);
        largeBox.removeProduct(cookies.get(0));
        largeBox.removeProduct(cookies.get(1));
        largeBox.totalCost();
    }
}
