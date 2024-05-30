package casestudies.elevator;

import polymorphism.B;

import java.util.List;

public class Building {
    private List<Floor> floors;
    private List<ElevatorCar> cars;

    // make a singleton building class
    private static Building building = null;

    public static Building getInstance() {
        if (building == null) {
            building = new Building();
        }
        return building;
    }
}
