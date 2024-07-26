package casestudies.locker;

import java.util.Date;

public class LockerPackage extends Package{
    int code;
    Date deliveryDate;
    int daysValid;
    String lockerId;
    String packageId;

    public LockerPackage(int code, Date deliveryDate, int daysValid, String lockerId, String packageId, Order order, Size size) {
        super(order, size);

        this.code = code;
        this.deliveryDate = deliveryDate;
        this.daysValid = daysValid;
        this.lockerId = lockerId;
        this.packageId = packageId;
    }

    public boolean isvalidCode(){
        return true;
    }

    public boolean verifyCode(int code){
        return true;
    }
}
