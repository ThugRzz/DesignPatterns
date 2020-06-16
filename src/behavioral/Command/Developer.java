package behavioral.Command;

public class Developer {
   private Command insertCommand;
    private Command deleteCommand;
    private Command updateCommand;
    private Command selectCommang;

    public Developer(Command insertCommand, Command deleteCommand, Command updateCommand, Command selectCommang) {
        this.insertCommand = insertCommand;
        this.deleteCommand = deleteCommand;
        this.updateCommand = updateCommand;
        this.selectCommang = selectCommang;
    }

    public void insertRecorc(){
        insertCommand.execute();
    }

    public void deleteRecord(){
        deleteCommand.execute();
    }
    public void updateRecord(){
        updateCommand.execute();
    }
    public void selectRecord(){
        selectCommang.execute();
    }
}
