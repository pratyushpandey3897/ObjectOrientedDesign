package casestudies.locker;

import java.util.List;

public class LockerLocation {
    String lat;
    String longitude;
    List<Locker> lockers;

    public void addLocker(Locker locker) {
        lockers.add(locker);
    }

    public void removeLocker(Locker locker) {
        lockers.remove(locker);
    }
}
