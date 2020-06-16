package behavioral.Memento;

import org.w3c.dom.ls.LSOutput;

public class ClientCode {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project...");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);
        System.out.println("Saving current version to github...");
        githubRepo.setSave(project.save());
        System.out.println("Updating version to 1.1");
        System.out.println("Writing poor code...");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("Something went wrong!");
        System.out.println("Rolling back...");
        project.load(githubRepo.getSave());
        System.out.println(project);
    }
}
