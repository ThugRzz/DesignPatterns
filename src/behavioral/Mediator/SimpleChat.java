package behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin){
        this.admin=admin;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }
    @Override
    public void sendMessage(String message, User sender) {
        for(User u:users){
            if(u!=sender){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
