package creational.Builder;

public class IphoneBuilder extends PhoneBuilder {
    @Override
    void buildModel() {
        phone.setModel(Model.Iphone_XS);
    }

    @Override
    void buildPrice() {
        phone.setPrice(55000);
    }

    @Override
    void buildYearOfIssue() {
        phone.setYearOfIssue(2018);
    }
}
