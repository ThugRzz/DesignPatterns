package structural.Proxy;

public class ClientCode {
    public static void main(String[] args) {
        Project project = new RealProject("hhtps://www.github.com/thugrzz/cooking_book");
        project.run();
    }
}
