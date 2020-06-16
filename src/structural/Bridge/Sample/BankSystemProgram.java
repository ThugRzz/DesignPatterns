package structural.Bridge.Sample;

public class BankSystemProgram extends Program {
    protected BankSystemProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        developer.writeCode();
        System.out.println(" for bank system program");
    }
}
