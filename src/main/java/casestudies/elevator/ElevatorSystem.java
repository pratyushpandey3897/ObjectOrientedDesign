package casestudies.elevator;

public class ElevatorSystem {
    private Building building;
    public void monitor() {
        //implement
    }
    public void dispatcher() {
        //implement
    }

    private ElevatorSystem() {
        //initialize the systems
    }
    //singleton to have only one system
    private static  ElevatorSystem elevatorSystem = null;
    public static ElevatorSystem getInstance() {
        if (elevatorSystem == null) {
            elevatorSystem = new ElevatorSystem();
        }
        return elevatorSystem;
    }


}
