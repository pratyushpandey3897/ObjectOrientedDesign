package casestudies.elevator;

import casestudies.elevator.enumerations.DoorState;

public class Door {
    private DoorState state;
    public boolean isOpen() {
        return state == DoorState.OPEN;
    }
}
