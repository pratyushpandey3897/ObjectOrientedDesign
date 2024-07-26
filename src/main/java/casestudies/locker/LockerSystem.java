package casestudies.locker;

import java.util.List;

public class LockerSystem {
    List<LockerLocation> lockerLocations;

    //singleton
    private LockerSystem lockerSystem = null;

    private LockerSystem(){
        lockerSystem = new LockerSystem();
    }
    public LockerSystem getInstance(){
        if(lockerSystem == null){
            lockerSystem = new LockerSystem();
        }
        return lockerSystem;
    }

    public Locker findAvailableLocker(Size size, String location){
        for(LockerLocation lockerLocation : lockerLocations){
            if(lockerLocation.lat.equals(location)){
                for(Locker locker : lockerLocation.lockers){
                    if(locker.size.equals(size) && locker.status.equals(LockerStatus.AVAILABLE)){
                        return locker;
                    }
                }
            }
        }
        return null;
    }

    //[todo] implement this method
    public void createPackages(Locker locker, Order order){
        //get all the packages in the locker
    }


}
