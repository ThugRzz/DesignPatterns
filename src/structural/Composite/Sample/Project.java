package structural.Composite.Sample;

public class Project {
    public static void main(String[] args) {
        Team projectTeam = new Team();
        Developer cppDeveloper = new CppDeveloper();
        Developer javaDeveloper = new JavaDeveloper();
        Developer firstPythonDeveloper = new PythonDeveloper();
        Developer secondPythonDeveloper = new PythonDeveloper();

        projectTeam.addDeveloper(cppDeveloper);
        projectTeam.addDeveloper(javaDeveloper);
        projectTeam.addDeveloper(firstPythonDeveloper);
        projectTeam.addDeveloper(secondPythonDeveloper);
        projectTeam.developProject();
        System.out.println("```````````````");
        projectTeam.removeDeveloper(secondPythonDeveloper);
        projectTeam.developProject();
    }
}
