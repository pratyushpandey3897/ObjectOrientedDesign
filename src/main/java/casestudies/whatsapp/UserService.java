package casestudies.whatsapp;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    Map<String, User> userList = new HashMap<> ();

    private void addUser(User user) {
        userList.put(user.id, user);
    }
    private void removeUser(User user) {
        userList.remove(user.id);
    }

}
