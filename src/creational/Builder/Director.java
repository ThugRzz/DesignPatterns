package creational.Builder;

public class Director {
    PhoneBuilder builder;

    public void setBuilder(PhoneBuilder builder) {
        this.builder = builder;
    }

    Phone buildPhone() {
        builder.createPhone();
        builder.buildModel();
        builder.buildPrice();
        builder.buildYearOfIssue();
        return builder.getPhone();
    }
}
