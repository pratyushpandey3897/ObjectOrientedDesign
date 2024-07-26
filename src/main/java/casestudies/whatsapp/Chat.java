package casestudies.whatsapp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Chat {
    String chatId;
    List<User> userInChat = new ArrayList<> ();
    List<Message> messages = new ArrayList<> ();

    public Chat(String chatId){
        this.chatId = chatId;
    }
}
