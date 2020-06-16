package structural.Adapter.AnotherSample;

public class JavaToDatabaseAdapter extends JavaApp implements Database {
    @Override
    public void insert() {
        saveInfo();
    }

    @Override
    public void delete() {
        removeInfo();
    }

    @Override
    public void select() {
        loadInfo();
    }

    @Override
    public void update() {
        changeInfo();
    }
}
