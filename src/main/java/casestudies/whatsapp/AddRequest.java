package casestudies.whatsapp;

public class AddRequest {
    private String fromUserId;
    private String toUserId;
    RequestStatus  status;

    public AddRequest(String fromUserId, String toUserId) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.status = RequestStatus.PENDING;
    }
    public void acceptRequest() {
        this.status = RequestStatus.ACCEPTED;
    }
    public void rejectRequest() {
        this.status = RequestStatus.REJECTED;
    }
}
