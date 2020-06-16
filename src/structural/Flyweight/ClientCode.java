package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ClientCode {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("java"));
        developers.add(developersFactory.getDeveloperBySpecialty("c++"));
        developers.add(developersFactory.getDeveloperBySpecialty("c++"));
        developers.add(developersFactory.getDeveloperBySpecialty("c++"));
        developers.add(developersFactory.getDeveloperBySpecialty("c++"));
        developers.add(developersFactory.getDeveloperBySpecialty("c++"));

        for(Developer developer:developers){
            developer.writeCode();
        }
    }
}
