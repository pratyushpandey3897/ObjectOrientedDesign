package casestudies.whatsapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    String name;
    String id;
    String passwrodHash;
    String phonenumber;

    private Map<String, User> friends = new HashMap<> ();
    private Map<String, PrivateChat> friendRequests = new HashMap<> ();
    private Map<String, GroupChat> groupChats = new HashMap<> ();
    List<AddRequest> receivedRequests = new ArrayList<> ();
    List<AddRequest> sentRequests = new ArrayList<> ();

    public void sendMessage(String message, String friendId) {
        // send the message to the user
    }
    public void sendGroupMessage(String message, String groupId) {
        // send the message to the group
    }
    public void sendFriendRequest(User user) {
        // send a friend request to the user
    }
    public void approveFriendRequest(AddRequest request) {
        // approve the friend request
    }
    public void declineFriendRequest(AddRequest request) {
        // decline the friend request
    }

}
