package behavioral.Iterator;

public class ClientCode {
    public static void main(String[] args) {
        String[] skills = {"Java", "Maven","Gradle","Spring","Hibernate"};
        JavaDeveloper developer = new JavaDeveloper("Andrew",skills);
        Iterator iterator = developer.getIterator();
        System.out.println("Name: "+developer.getName());
        System.out.print("Skills: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
