package structural.Bridge.Sample;

public class BridgePatternSampleRunner {
    public static void main(String[] args) {
        Program website = new WebsiteProgram(new PhpDeveloper());
        Program bankSystem = new BankSystemProgram(new JavaDeveloper());
        website.developProgram();
        bankSystem.developProgram();
    }
}
