package structural.Adapter.AnotherSample;

public class AppRunner {
    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter();
        database.insert();
        database.delete();
        database.select();
        database.update();
    }
}
