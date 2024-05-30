package casestudies.atm.state;

public class CheckBalanceState extends ATMState {
    @Override
    public void checkBalance() {
        System.out.println("Balance is 1000");
    }
    @Override
    public void ejectCard() {
        System.out.println("Card is ejected");
    }

}
