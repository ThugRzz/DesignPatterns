package creational.Prototype;

public class VCSRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"Master Project","Some code");
        System.out.println(master);
        ProjectFactory projectFactory = new ProjectFactory(master);
        Project cloneProject = projectFactory.cloneProject();
        System.out.println("=============================");
        System.out.println(cloneProject);
    }
}
