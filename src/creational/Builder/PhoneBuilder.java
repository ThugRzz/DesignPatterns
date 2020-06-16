package creational.Builder;

public abstract class PhoneBuilder {
    Phone phone;

    void createPhone() {
        phone = new Phone();
    }

    abstract void buildModel();

    abstract void buildPrice();

    abstract void buildYearOfIssue();

    Phone getPhone() {
        return phone;
    }

}
