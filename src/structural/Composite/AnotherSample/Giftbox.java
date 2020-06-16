package structural.Composite.AnotherSample;

import java.util.ArrayList;
import java.util.List;

public class Giftbox {
    private int price;
    private List<Product> products = new ArrayList<Product>();
    public void addProduct(Product product){
        price+=product.price();
        products.add(product);
    }
    public void removeProduct(Product product){
        if(!products.contains(product)){
            System.out.println("This product is not contains in giftbox");
        }
        else{
            price-=product.price();
            products.remove(product);
        }
    }
    public void totalCost(){
        System.out.println("Total cost of giftbox = "+price);
    }
}
