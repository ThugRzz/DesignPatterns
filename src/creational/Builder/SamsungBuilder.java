package creational.Builder;

public class SamsungBuilder extends PhoneBuilder {
    @Override
    void buildModel() {
        phone.setModel(Model.Samsung_Galaxy_Note10);
    }

    @Override
    void buildPrice() {
        phone.setPrice(50000);
    }

    @Override
    void buildYearOfIssue() {
        phone.setYearOfIssue(2019);
    }
}
