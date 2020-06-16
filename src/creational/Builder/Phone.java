package creational.Builder;

public class Phone {
    private Model model;
    private int price;
    private int yearOfIssue;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue=yearOfIssue;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model=" + model +
                ", price=" + price +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
