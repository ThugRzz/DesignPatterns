package structural.Composite.Sample;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developersTeam = new ArrayList<Developer>();
    public void addDeveloper(Developer developer){
        developersTeam.add(developer);
    }
    public void removeDeveloper(Developer developer){
        developersTeam.remove(developer);
    }
    public void developProject(){
        System.out.println("Starting develop project");
        for(Developer developer:developersTeam){
            developer.writeCode();
        }
    }
}
