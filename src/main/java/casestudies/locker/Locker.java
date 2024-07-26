package casestudies.locker;

public class Locker {
    int id;
    Size size;
    LockerLocation location;
    LockerStatus status;


    public void addPackge(){
        // add a package to the locker
        this.status = LockerStatus.OCCUPIED;

    }

    public void removePackage(){
        // remove a package from the locker
        this.status = LockerStatus.AVAILABLE;
    }


}
