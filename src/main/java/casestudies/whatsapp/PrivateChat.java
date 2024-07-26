package casestudies.whatsapp;

public class PrivateChat extends Chat{

    public PrivateChat(String chatId, User firstUser, User secondUser) {

        super (chatId);
        userInChat.add(firstUser);
        userInChat.add(secondUser);
    }
}
