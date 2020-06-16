package behavioral.Visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting code after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing reliable test");
    }
}
