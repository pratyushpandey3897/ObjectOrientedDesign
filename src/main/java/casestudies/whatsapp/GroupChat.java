package casestudies.whatsapp;

public class GroupChat extends Chat{

        public GroupChat(String chatId) {

            super (chatId);
        }
        public void addUser(User user){
            userInChat.add(user);
        }
        public void removeUser(User user){
            userInChat.remove(user);
        }
}
