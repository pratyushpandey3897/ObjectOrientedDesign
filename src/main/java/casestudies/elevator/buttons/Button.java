package casestudies.elevator.buttons;

public abstract class Button {
    private boolean status;

    public void pressDown () {
        status = true;
    }

    public abstract boolean isPressed();
}
