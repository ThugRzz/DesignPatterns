package structural.Bridge.Sample;

public class WebsiteProgram extends Program {

    protected WebsiteProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
        System.out.println(" for website program");
    }
}
