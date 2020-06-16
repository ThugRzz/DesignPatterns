package behavioral.Command;

import javax.xml.crypto.Data;

public class ClientCode {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database)
        );

        developer.insertRecorc();
        developer.deleteRecord();
        developer.updateRecord();
        developer.selectRecord();
    }
}
