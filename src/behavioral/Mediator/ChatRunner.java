package behavioral.Mediator;

public class ChatRunner {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();
        User admin = new Admin(chat,"Admin");
        User user1 = new SimpleUser(chat,"User 1");
        User user2 = new SimpleUser(chat,"User 2");
        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.sendMessage("Hi there!",user1);
        chat.sendMessage("Hi!",user2);
        chat.sendMessage("Hello, I am admin",admin);

    }
}
