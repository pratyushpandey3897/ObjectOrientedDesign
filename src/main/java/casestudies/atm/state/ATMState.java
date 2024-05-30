package casestudies.atm.state;

public abstract class ATMState {

    public void insertCard() {
        System.out.println("Card is already inserted");
    }
    public  void checkBalance() {
        System.out.println("Balance is 1000");
    }
    public void withdraw() {
        System.out.println("Amount is withdrawn");
    }
    public void ejectCard() {
        System.out.println("Card is ejected");
    }


}
